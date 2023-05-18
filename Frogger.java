import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frogger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

    protected void reset(){
        setRotation(-90);
        setLocation(world.getWidth()/2, world.getHeight() - 50);
    }

    protected void die(Game game){
        
        world.livesDown();
        world.addObject(new Corpse(this), getX(), getY());

        reset();
    }
}