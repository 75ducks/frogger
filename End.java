import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * displays a screen that says game over when you die. Takes you to the start screen if R is pressed.
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class End extends World
{
    Game game;
    Start start;
    Frogger Frogger = new Frogger();
    /**
     * Constructor for objects of class End.
     * 
     */

    public End(Game g, Start s) 
    {    

        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        this.game = g;
        this.start = s;
    }

    /** 
     *
     * Act
     *
     */
    public void act(){ 

        showText("Game Over", getWidth()/2, getHeight()/2);  
        showText("click R to go to start ", getWidth()/2, getHeight()/2 + 50); 
        if (Greenfoot.isKeyDown("r")){//when r is pressed switches to start menu
            Greenfoot.setWorld(start);
        }

    }
}

