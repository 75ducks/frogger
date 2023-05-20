import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * corpse spawns where Frogger dies and decays slowly
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Corpse extends Actor
{

    int rotation;
    World world;
    int decay;

    /** 
     *
     * Corpse
     *
     * @param f  the f. 
     * @return public
     */
    public Corpse(Frogger f){ 

        GreenfootImage fimg = f.getImage();
        getImage().scale(fimg.getWidth(), fimg.getHeight());
        rotation = f.getRotation();
        decay = 255;
    }

    /**
     * Act - do whatever the Corpse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {

        if(world == null){
            world = getWorld();  
            setRotation(rotation);   
        }
        getImage().setTransparency(decay);
        decay = decay -3;
        if(decay < 50){
            world.removeObject(this); 
        }
    }
}
