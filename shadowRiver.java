import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shadow river acts as a hit box for the gif river
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class shadowRiver extends River
{

    int width;
    int height = 180;
    /**
     * Act - do whatever the shadowRiver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {

        if(world == null){
            world = getWorld();
            img = getImage();

            width = world.getWidth();

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
            player.die(game);

        }
    }
}
