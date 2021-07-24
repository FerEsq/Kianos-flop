import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kiano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kiano extends Actor
{
    /**
     * Act - do whatever the Kiano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimiento();
    }
    
    int x = 45;
    int y = 45;
    
    public void movimiento() //método mueve
    {        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(x, y);
            x -= 2;
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(x, y);
            x += 2;
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y);
            y -= 2;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y);
            y += 2;
        }
    }
        

}
