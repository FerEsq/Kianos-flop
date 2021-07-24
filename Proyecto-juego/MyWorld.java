import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int puntos = 0;
    public static int cont = 6;
    
    //Constructor for objects of class MyWorld.

    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
        camarones_L();
        camarones_E();
    }
    
    public void act()
    {
        Heart heart = new Heart();
        addObject(heart,460,30);
        Heart heart2 = new Heart();
        addObject(heart2,430,30);
        Heart heart3 = new Heart();
        addObject(heart3,400,30);
        showText("Score: " + puntos, 530, 25);
        if (cont == 0)
        {
            cont = 6;
            camarones_L();
            camaron_EE();
        }
    }
    
    public int RND(int ini,int fin) //función para obtener numeros random dentro de un rango
    {
        int num = Greenfoot.getRandomNumber(fin - ini +1);
        return num + ini;
    }
        
    private void prepare()
    {
        Shrimp_poisoned shrimp_poisoned = new Shrimp_poisoned();
        Shrimp_clean shrimp_clean = new Shrimp_clean();
        Kiano kiano = new Kiano();
        addObject(kiano,45,45);
    }  
    
    public void camarones_L()
    {
        for (int i = 0; i < 6; i++) //generación random de camarones limpios
        {
            int xc = RND(75,550);
            int yc = RND(75,350);
            addObject(new Shrimp_clean(), xc, yc);
        } //genera 6
    }
    public void camarones_E()
    {
        for (int i = 0; i < 4; i++) //generación random de camarones envenenados
        {
            int xc = RND(75,550);
            int yc = RND(75,350);
            addObject(new Shrimp_poisoned(), xc, yc);
        } //genera 4 
    }
    public void camaron_EE()
    {
        int xc = RND(75,550);
        int yc = RND(75,350);
        addObject(new Shrimp_poisoned(), xc, yc); //genera 1
    }
    
}
