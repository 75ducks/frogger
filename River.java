import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class River here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class River extends Actor
{
    int width;
    int height = 200;

    GreenfootImage img;
    GifImage river;
    UiElement water;
    World world;

    /**
     * Act - do whatever the River wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

        if(world == null){
            world = getWorld();
            // img = getImage();

            // width = world.getWidth();

            // img.scale(width, height);
            river = new GifImage("river.gif");
            water = new UiElement(river);
            

        }

    }    
}