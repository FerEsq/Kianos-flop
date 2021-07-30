import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Descripción: Clase del protagonista del juego, el caracal Kiano.
 * Programadora: Fernanda Esquivel
 * Carné: 21542
 * Lenguaje: Java
 * Recursos: Greenfoot
 * Historial: Finalizado el 24.07.2021
 */

public class Kiano extends Actor
{
    MyWorld mundo; //variable para referenciar las variables estaticas de MyWorld (mundo)
    public void act()
    {
        movimiento();
        comer_CL();
        comer_CE();
    }
    
    //coordenadas de kiano
    int x = 45;
    int y = 45;
    
    public void movimiento() //método para mover a kiano
    {        
        if (Greenfoot.isKeyDown("left")) //al presionar la flecha izquierda
        {
            x -= 3; //se mueve dos a la izquierda
            setLocation(x, y);
        }
        if (Greenfoot.isKeyDown("right")) //al presionar la flecha derecha
        {
            x += 3; //se mueve dos a la derecha
            setLocation(x, y);
        }
        if (Greenfoot.isKeyDown("up")) //al presionar la flecha arriba
        {
            y -= 3; //se mueve dos hacia arriba
            setLocation(x, y);
        }
        if (Greenfoot.isKeyDown("down")) //al presionar la flecha abajo
        {
            y += 3; //se mueve dos hacia abajo
            setLocation(x, y);
        }
    }
    
    public void comer_CL() //método comer camaron limpio
    {
        Actor camaronL;
        camaronL = getOneObjectAtOffset(0,0, Shrimp_clean.class);
        if (camaronL != null) //si kiano toca el camaron
        {
            World world;
            world = getWorld();
            world.removeObject(camaronL); //desaparece el camaron limpio
            mundo.cont--; //un camaron limpio menos
            mundo.puntos++; //un punto mas
        }
    }
    
    public void comer_CE() //método comer camaron envenenado
    {
        Actor camaronE;
        camaronE = getOneObjectAtOffset(0,0, Shrimp_poisoned.class);
        if (camaronE != null) //si kiano toca el camaron
        {
            World world;
            world = getWorld();
            world.removeObject(camaronE); //desaparece el camaron envenenado
            mundo.corazones--; //quita una vida
        }
    }
        
}