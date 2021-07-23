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
    private void prepare()
    {
        Shrimp_poisoned shrimp_poisoned = new Shrimp_poisoned();
        addObject(shrimp_poisoned,354,160);
        Shrimp_clean shrimp_clean = new Shrimp_clean();
        addObject(shrimp_clean,323,198);
        Kiano kiano = new Kiano();
        addObject(kiano,74,59);
        shrimp_clean.setLocation(172,101);
        shrimp_poisoned.setLocation(132,147);
        kiano.setLocation(76,82);
        shrimp_poisoned.setLocation(126,186);
        shrimp_clean.setLocation(184,52);
        shrimp_poisoned.setLocation(209,117);
        shrimp_clean.setLocation(254,58);
        shrimp_poisoned.setLocation(167,70);
        shrimp_clean.setLocation(150,127);
        shrimp_poisoned.setLocation(199,48);
        shrimp_poisoned.setLocation(179,88);
        removeObject(shrimp_poisoned);
        removeObject(shrimp_clean);
    }
}
