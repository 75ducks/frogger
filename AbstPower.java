import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstPower extends Actor
{
    protected int width;
    protected int height;
    protected Game world;
    protected GreenfootImage img;
    
    public AbstPower(int w, int h){
        this.width = w;
        this.height = h;
    }
    public AbstPower(){
        this.width = 50;
        this.height = 50;
    }
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
          if(world == null){
            world = (Game)getWorld();
            img = getImage();
            
            img.scale(width, height);
        }
        
    }
    public void interact(Frogger player){
    }
}
