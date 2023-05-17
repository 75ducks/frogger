import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Die here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Die extends AbstPower
{
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
    public void interact(Frogger player){
        if (intersects(player)){
            player.die();
        }
    }
}
