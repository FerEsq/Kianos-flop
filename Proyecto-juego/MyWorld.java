import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    public int RND(int ini,int fin)
    {
        int num = Greenfoot.getRandomNumber(fin - ini +1);
        return num + ini;
    }
    
    private void prepare()
    {
        Shrimp_poisoned shrimp_poisoned = new Shrimp_poisoned();
        addObject(shrimp_poisoned,354,160);
        Shrimp_clean shrimp_clean = new Shrimp_clean();
        addObject(shrimp_clean,323,198);
        Kiano kiano = new Kiano();
        addObject(kiano,74,59);
        kiano.setLocation(45,45);

        for (int i = 0; i <= 10; i++)
        {
            int xc = RND(70,550);
            int yc = RND(70,350);
            addObject(new Shrimp_clean(), xc, yc);
        }

        for (int i = 0; i <= 6; i++)
        {
            int xc = RND(70,550);
            int yc = RND(70,350);
            addObject(new Shrimp_poisoned(), xc, yc);
        }
    }
}
