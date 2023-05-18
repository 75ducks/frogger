import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Actor
{
    World world;
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
    public void interact(Frogger player, Game game){
        if (intersects(player)){
            game.levelUp();
            player.reset();
        }
    }
}
