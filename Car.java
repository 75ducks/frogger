import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends AbstOther
{
    Game game;
    public Car(int speed, Game game){
        super(speed + game.getLevel()*2);
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
    
    public void interact(Frogger player, Game game){
        if (intersects(player)){
            player.die(game);
            
        }
    }
    public boolean onTop(Frogger player){
        return intersects(player);
        
    }

}
