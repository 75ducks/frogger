import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Road is the graphic the cars drive on
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Road extends Actor{
    int width;
    int height = 100;

    GreenfootImage img;
    World world;

    /**
     * Act - do whatever the Road wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()  
    {

        // Add your action code here.
        if(world == null){
            world = getWorld();
            img = getImage();

            width = world.getWidth();

            img.scale(width, height);
        }
    }    
}
