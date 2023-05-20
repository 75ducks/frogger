import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ui element displays the gif properly
 * 
 * @author Nevis Macintyre
 * @version V1.00 5/18/2023
 */
public class UiElement extends Actor
{
    private GifImage gif;
    private int width =-99;
    private int height = -99;

    /** 
     *
     * Ui element
     *
     * @param gif  the gif. 
     * @return public
     */
    public UiElement(GifImage gif){ 

        this.gif = gif;
    }

    /** 
     *
     * Ui element
     *
     * @param gif  the gif. 
     * @param w  the w. 
     * @param h  the h. 
     * @return public
     */
    public UiElement(GifImage gif, int w, int h){ 

        this.gif = gif;
        width = w; 
        height = h;
    }

    /**
     * Act - do whatever the UiElement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {

        GreenfootImage current = gif.getCurrentImage();
        if(width !=-99){
            current.scale(width, height);
        }
        setImage(current);
    }
}

