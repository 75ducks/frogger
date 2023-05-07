import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    Frogger player;
    Start start;
    End end;

    int numCars = 3;
    int numRock = 4;
    int numLogs = 2;

    Car[] cars1 = new Car[numCars];
    Car[] cars2 = new Car[numCars];

    Rock[] rock = new Rock[numRock];
    Rock[] rock2 = new Rock[numRock];

    Log[] log1 = new Log[numLogs];
    Log[] log2 = new Log[numLogs];

    Road road1;
    Road road2;

    River river1;
    GifImage river;
    UiElement water;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1, false);
        start = new Start(this);
        end = new End(this, start);
        Greenfoot.setWorld(start);
        river = new GifImage("river.gif");
        water = new UiElement(river,1000, 210);

        setPaintOrder(Car.class, Frogger.class, Rock.class,Log.class);
        player = new Frogger();
        addObject(player , getWidth()/2, getHeight() - 50);

        for(int i = 0; i < numCars; i++){
            cars1[i] = new Car(5);
            addObject(cars1[i], 100 + i * 200, getHeight() - 150);
        }

        for(int i = 0; i < numCars; i++){
            cars2[i] = new Car(3);
            cars2[i].setRotation(180);
            addObject(cars2[i], 100 + i * 250, getHeight() - 250);
        }

        for(int i = 0; i < numRock; i++){
            rock[i] = new Rock(4);
            addObject(rock[i], 150 + i * 250, getHeight() - 400);
        }
        for(int i = 0; i < numRock; i++){
            rock2[i] = new Rock(4);
            addObject(rock2[i], 50 + i * 250, getHeight() - 500);
        }

        for(int i = 0; i < numLogs; i++){
            log1[i] = new Log(2, 200, 50);
            addObject(log1[i], 100 + i * 350, getHeight() - 450);
        }
        for(int i = 0; i < numLogs; i++){
            log2[i] = new Log(-2, 200, 50);
            addObject(log2[i], 100 + i * 350, getHeight() - 550);
        }

        road1 = new Road();
        addObject(road1, getWidth()/2, getHeight() - 125);
        road2 = new Road();
        addObject(road2, getWidth()/2, getHeight() - 275);

        // river1 = new River();
        addObject(water, getWidth()/2, 225);

    }

    public void act(){
        //List<Rock> allRocks = getObjects(Rock.class);
    }

}
