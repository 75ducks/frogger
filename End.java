import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{
    Game game;
    Start start;
    /**
     * Constructor for objects of class End.
     * 
     */
    public End(Game g, Start s)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        this.game = g;
        this.start = s;
    }

    public void act(){
        showText("done ", getWidth()/2, getHeight()/2); 
        if (Greenfoot.isKeyDown("s")){
            Greenfoot.setWorld(start);
        }
    }
}
