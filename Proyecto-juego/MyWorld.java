import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //variables estaticas para contadores
    public static int puntos = 0; //puntaje = 0 al iniciar
    public static int cont = 6; //se crean 6 camarones limpios siempre
    
    //Constructor for objects of class MyWorld.

    public MyWorld() //al iniciar el mundo (no hay necesidad de darle run)
    {    
        super(600, 400, 1); 
        prepare();
        camarones_L();
        camarones_E();
    }
    
    public void act() //al darle a run
    {
        // instancia los corazones
        Heart heart = new Heart();
        addObject(heart,460,30);
        Heart heart2 = new Heart();
        addObject(heart2,430,30);
        Heart heart3 = new Heart();
        addObject(heart3,400,30);
        showText("Score: " + puntos, 530, 25); //muestra el punteo
        // si se acaban los camarones
        if (cont == 0)
        {
            cont = 6; //el contador se reinicia
            camarones_L(); //genera otros 6 camarones
            camaron_EE();
        }
    }
    
    public int RND(int ini,int fin) //función para obtener numeros random dentro de un rango
    {
        int num = Greenfoot.getRandomNumber(fin - ini +1);
        return num + ini;
    }
        
    private void prepare() //prepara el mundo (instancia los camarones y a kiano, ademas de colocarlo)
    {
        Shrimp_poisoned shrimp_poisoned = new Shrimp_poisoned();
        Shrimp_clean shrimp_clean = new Shrimp_clean();
        Kiano kiano = new Kiano();
        addObject(kiano,45,45);
    }  
    
    public void camarones_L() //generación random de camarones limpios
    {
        for (int i = 0; i < 6; i++) //genera 6
        {
            int xc = RND(75,550);
            int yc = RND(75,350);
            addObject(new Shrimp_clean(), xc, yc);
        } 
    }
    public void camarones_E() //generación random de camarones envenenados
    {
        for (int i = 0; i < 4; i++) //genera 4 
        {
            int xc = RND(75,550);
            int yc = RND(75,350);
            addObject(new Shrimp_poisoned(), xc, yc);
        } 
    }
    public void camaron_EE() //genera 1 camaron envenenado extra para la siguiente ronda
    {
        int xc = RND(75,550);
        int yc = RND(75,350);
        addObject(new Shrimp_poisoned(), xc, yc);
    }
    
}
