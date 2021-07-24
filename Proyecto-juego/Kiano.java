import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kiano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kiano extends Actor
{
    MyWorld mundo; //variable para referenciar las variables estaticas de MyWorld (mundo)
    public void act()
    {
        movimiento();
        comer();
    }
    
    //coordenadas de kiano
    int x = 45;
    int y = 45;
    
    public void movimiento() //método para mover a kiano
    {        
        if (Greenfoot.isKeyDown("left")) //al presionar la flecha izquierda
        {
            setLocation(x, y);
            x -= 2; //se mueve dos a la izquierda
        }
        if (Greenfoot.isKeyDown("right")) //al presionar la flecha derecha
        {
            setLocation(x, y);
            x += 2; //se mueve dos a la derecha
        }
        if (Greenfoot.isKeyDown("up")) //al presionar la flecha arriba
        {
            setLocation(x, y);
            y -= 2; //se mueve dos hacia arriba
        }
        if (Greenfoot.isKeyDown("down")) //al presionar la flecha abajo
        {
            setLocation(x, y);
            y += 2; //se mueve dos hacia abajo
        }
    }
    
    public void comer() //método comer camaron limpio
    {
        //si kiano esta lejos del camaron
        Actor camaronL;
        camaronL = getOneObjectAtOffset(0,0, Shrimp_clean.class);
        if (camaronL != null) //si kiano toca el camaron
        {
            World world;
            world = getWorld();
            world.removeObject(camaronL); //desaparece
            mundo.cont--; //un camaron limpio menos
            mundo.puntos++; //un punto mas
        }
    }
        
}