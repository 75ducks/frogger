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
* @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public abstract class AbstOther extends Actor
{
    protected int speed;
    protected int width;
    protected int height;
    protected Game world;
    protected GreenfootImage img;

    /** 
     *
     * Abst other
     *
     * @param speed  the speed. 
     * @return public
     */
    public AbstOther(int speed){ 

        this.speed = speed;
    }

    /** 
     *
     * Abst other
     *
     * @param speed  the speed. 
     * @param w  the w. 
     * @param h  the h. 
     * @return public
     */
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
        if(getX() > world.getWidth()){// if it  goes off screen reset it
            setLocation(0, getY());
        }
        else if(getX() < 0){// if it  goes off screen reset it
            setLocation(world.getWidth(), getY());
        }
    }
    
    public void interact(Frogger player, Game game){}

}