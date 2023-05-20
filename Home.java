import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Home sends the player to the next level
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class Home extends Actor
{
    World world;
    nextLvl next;
    GreenfootImage img;
    int width = 100;
    int height = 100;

    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()  
    {

        if(world == null){
            world = getWorld();
            img = getImage();

          
            img.scale(width, height);
        }
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
            game.levelUp();
            next = new nextLvl(game);
            Greenfoot.setWorld(next);
        }
    }
}
