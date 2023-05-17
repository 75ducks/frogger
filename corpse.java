import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Corpse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corpse extends Actor
{
    
    int rotation;
    World world;
    int decay;
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
        decay --;
        if(decay < 50){
           world.removeObject(this); 
        }
    }
}