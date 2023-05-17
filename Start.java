import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    private Game game;
    GifImage frogger;
    UiElement title;
    
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start(Game g)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        this.game = g;
        frogger = new GifImage("title.gif");
        title = new UiElement(frogger);

        addObject(title, getWidth()/2, 150);
    }
    
    public void act(){
        showText("CLICK SPACE", getWidth()/2, getHeight()/2); 
        
        if (Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(game);
        }
        
    }
}
