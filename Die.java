import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player dies when they touch the die power
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Die extends AbstPower
{

    /** 
     *
     * Die
     *
     * @return public
     */
    public Die(){ 

        super();
    }

    /**
     * Act - do whatever the Die wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {

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
