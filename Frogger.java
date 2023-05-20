import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Frogger is what the player uses to interact with the other elements of the game
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Frogger extends Actor
{
    int speed; 
    GreenfootImage img;
    Game world;
    int leapsize = 50;
    final int keyCooldown = 10;
    private int keyTimer;
    private int lives;


    /** 
     *
     * Frogger
     *
     * @return public
     */
    public Frogger(){ 

        img = getImage();
        img.scale(leapsize, leapsize);

    }

    /**
     * Act - do whatever the Frogger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()  
    {

        // Add your action code here.

        if(world == null){
            world = (Game)getWorld();

            //reset
            reset();

        }

        //get input from user
        if(isAtEdge() != true){
            getKeys();
        }
        else{
            setLocation(world.getWidth()/2, world.getHeight() - 50);
        } 

        //update position

        //check to see if it's dead or off the screen

    }   

    /** 
     *
     * Gets the keys being pressed
     *
     */
    protected void getKeys(){ 

        if(keyTimer > keyCooldown){
            if(Greenfoot.isKeyDown("w")){
                setRotation(-90);
                move(leapsize);
                keyTimer = 0;
            }
            else if(Greenfoot.isKeyDown("s")){
                setRotation(90);
                move(leapsize);
                keyTimer = 0;
            }
            else if(Greenfoot.isKeyDown("a")){
                setRotation(180);
                move(leapsize);
                keyTimer = 0;
            }
            else if(Greenfoot.isKeyDown("d")){
                setRotation(0);
                move(leapsize);
                keyTimer = 0;
            }
            else{

            }
        }
        keyTimer++;
    }

    /** 
     *
     * Reset Frogger
     *
     */
    protected void reset(){ 

        setRotation(-90);
        setLocation(world.getWidth()/2, world.getHeight() - 50);
    }

    /** 
     *
     * Die
     *
     * @param game  the game. 
     */
    protected void die(Game game){ 

        world.livesDown();
        world.addObject(new Corpse(this), getX(), getY());

        reset();
    }
}