import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
     * Has:
     * size / width
     * world, img
     * 
     * Does:
     * scales img
     * 
     * @author Nevis Macintyre
     * @version V1.00 5/18/2023
     */
public abstract class AbstPower extends Actor
{
    protected int width;
    protected int height;
    protected Game world;
    protected GreenfootImage img;

    /** 
     *
     * Abst power constructor
     *
     * @param w  the w. 
     * @param h  the h. 
     * 
     */
    public AbstPower(int w, int h){ 

        this.width = w;
        this.height = h;
    }

    /** 
     *
     * Abst power constructor
     *
     *
     */
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

    /** 
     *
     * Interact
     *
     * @param player  the player. 
     */
    public void interact(Frogger player){ 

    }
}
