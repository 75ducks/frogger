import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates a log. player rides the log to aviod touching the river
 * 
* @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Log extends AbstOther
{

    /** 
     *
     * Log constructor
     *
     * @param s  the s. 
     * @param w  the w. 
     * @param h  the h. 
     */
    public Log(int s, int w, int h){ //Speed, height, width
        super(s, w, h);
    }

    /**
     * Act - do whatever the Log wants to do. This method is called whenever
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
    public void interact(Frogger player, Game game){} 
    
}
