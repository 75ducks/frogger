import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shadowRiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shadowRiver extends River
{
    World world;
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

    public void interact(Frogger player){
        if (intersects(player)){
            player.die();
        }
    }
}
