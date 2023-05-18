import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a car that gets faster as the level goes up and goes to the other side of the map when it reaches the border. player dies when hit
 * 
* @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Car extends AbstOther
{
    Game game;

    /** 
     *
     * Car constructor
     *
     * @param speed  the speed. 
     * @param game  the game. 
     */
    public Car(int speed, Game game){ 

        super(speed + game.getLevel()*2);//adds the level * 2 to the speed
    }

    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()  
    {

        // Add your action code here.
        super.act();
    }    

    /** 
     *
     * Interact
     *
     * @param player  the player. 
     * @param game  the game. 
     */
    public void interact(Frogger player, Game game){ 

        if (intersects(player)){
            player.die(game);

        }
    }

}
