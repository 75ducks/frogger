import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Has:
 * speed
 * size / width
 * world, img
 * 
 * Does:
 * moves to side
 * resets when off screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class AbstOther extends Actor
{
    protected int speed;
    protected int width;
    protected int height;
    protected Game world;
    protected GreenfootImage img;
    
    public AbstOther(int speed){
        this.speed = speed;
    }
    
    public AbstOther(int speed, int w, int h){
        this.speed = speed;
        width = w;
        height = h;
        img = getImage();
        img.scale(width, height);
    }
    
    /**
     * Act - do whatever the Frogger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if(world == null){
            world = (Game)getWorld();
        }
        move(speed);
        if(getX() > world.getWidth()){
            setLocation(0, getY());
        }
        else if(getX() < 0){
            setLocation(world.getWidth(), getY());
        }
    }
    
    public abstract void interact(Frogger player);
    
    
}
