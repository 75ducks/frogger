import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nextLvl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nextLvl extends World
{
    Game game;
    Frogger Frogger = new Frogger();
    /**
     * Constructor for objects of class End.
     * 
     */

    public nextLvl(Game g) 
    {    

        // Create a new world with 1000x700 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        this.game = g;
    }

    /** 
     *
     * Act
     *
     */
    public void act(){ 

        showText("Level complete", getWidth()/2, getHeight()/2);
        showText("click Space continue", getWidth()/2, getHeight()/2 + 50);
        if (Greenfoot.isKeyDown("Space")){//when r is pressed switches to start menu
            Greenfoot.setWorld(new Game());
        }

    }
}
