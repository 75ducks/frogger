import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log extends AbstOther
{
    public Log(int s, int w, int h){
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
    
    public void interact(Frogger player, Game game){}
    
    public boolean onTop(Frogger player){
        if (intersects(player)){
            return true;
        }
        else {
            return false;
        }
    }
}
