import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates a rock. player uses rock to aviod touching the river
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Rock extends AbstOther
{

    /** 
     *
     * Rock constructor
     *
     * @param speed  the speed. 
     * 
     */
    public Rock(int speed){ 

        super(0);//rock doesn't move. speed will always be zero
    }

    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
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

        if (intersects(player)== true){
            player.die(game);

        }
    }

    /** 
     *
     * On top
     *
     * @param player  the player. 
     * @return boolean
     */
    public boolean onTop(Frogger player){ 

        return intersects(player);

    }
}