import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a river gif
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class River extends Actor
{

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

            river = new GifImage("river.gif");
            water = new UiElement(river);
        }

    } 
}
