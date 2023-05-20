import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Game builds the game and runs until the player runs out of lives then changes to game over screen
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Game extends World
{

    private Frogger player;
    private Start start;
    private End end;

    private int speed = 5;

    private int numCars = 3;
    private int numRock = 4;
    private int numLogs = 2;
    private int lives = 3;
    private int level = 1;

    private Car[] cars1;
    private Car[] cars2;

    private Rock[] rock = new Rock[numRock];
    private Rock[] rock2 = new Rock[numRock];

    private Log[] log1 = new Log[numLogs];
    private Log[] log2 = new Log[numLogs];

    private Road road1;
    private Road road2;

    private Home home;

    private GifImage gif;
    private UiElement water;

    private shadowRiver river;

    private Die die;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public Game() 
    {    

        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1, false);
        start = new Start(this);
        end = new End(this, start);
        Greenfoot.setWorld(start);

        cars1 = new Car[numCars];
        cars2 = new Car[numCars];

        gif = new GifImage("river.gif");
        water = new UiElement(gif,1000, 210);

        setPaintOrder(Die.class, Car.class, Frogger.class, Rock.class,Log.class);//sets the order of whats displayed on top

        //creating and adding objects to the game
        
        player = new Frogger();
        addObject(player ,getWidth()/2 , getHeight() -50);

        river = new shadowRiver();
        addObject(river, getWidth()/2, 225);

        road1 = new Road();
        addObject(road1, getWidth()/2, getHeight() - 125);
        road2 = new Road();
        addObject(road2, getWidth()/2, getHeight() - 275);

        home = new Home();
        addObject(home, getWidth()/2, 50);

        die = new Die();
        addObject(die, spawnX(), spawnY());

        Random random = new Random();
        
        
        //using for loops to space out and add multiple objects from the same class

        for(int i = 0; i < numCars; i++){
            cars1[i] = new Car(speed, this);
            addObject(cars1[i], 100 + i * 200, getHeight() - 150);
        }
        for(int i = 0; i < numCars; i++){
            cars2[i] = new Car(speed, this);
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

    }

    /** 
     *
     * Act
     *
     */
    public void act(){ 
        //display lives and level
        showText("Lives:" +lives, 50, 20);
        showText("Level:" +level, 50, 40);

        home.interact(player, this);//check to see if player has beaten the level
        die.interact(player, this);//check to see if player hit the skull

        List<Rock> allRocks = getObjects(Rock.class);//create and array list
        for(Rock rock : allRocks){//go through every object in the array list
            // if(rock.onTop(player) == false){
              // river.interact(player, this);
            // }
        }
        
        List<Car> allCars = getObjects(Car.class);
        for(Car car : allCars){
            car.interact(player, this);  
        }
        
        List<Log> allLogs = getObjects(Log.class);
        for(Log log : allLogs){

        }

        if(lives <= 0){//if they have no lives set the screen to game over
            Greenfoot.setWorld(end);
            lives = 3;
        }

    }

    /** 
     *
     * Level up
     *
     */
    public void levelUp(){ 

        level++;
    }

    /** 
     *
     * Gets the level
     *
     * @return the level
     */
    public int getLevel(){ 

        return level;
    }

    /** 
     *
     * Lives down
     *
     */
    public void livesDown(){ 

        lives--;
    }

    /** 
     *
     * Gets the lives
     *
     * @return the lives
     */
    public int getLives(){ 

        return lives;
    }

    /** 
     *
     * Spawn Y
     *
     * @return int
     */
    public int spawnY(){ 

        Random random = new Random();
        return random.nextInt(getHeight()-225)+225;//makes sure the random number is not past the river
    }

    /** 
     *
     * Spawn X
     *
     * @return int
     */
    public int spawnX(){ 

        Random random = new Random(); 
        return random.nextInt(getWidth());
    }
}