import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Descripción: Clase del mundo del juego (patio de Kiano)
 * Programadora: Fernanda Esquivel
 * Carné: 21542
 * Lenguaje: Java
 * Recursos: Greenfoot
 * Historial: Finalizado el 24.07.2021
 */

public class MyWorld extends World
{
    //variables estaticas para contadores
    public static int puntos = 0; //puntaje = 0 al iniciar
    public static int cont = 6; //se crean 6 camarones limpios siempre
    public static int corazones = 3; //hay tres vidas (corazones)
    
    GreenfootSound music = new GreenfootSound("Kiano_Song_Full.mp3"); //música
    
    //Constructor for objects of class MyWorld.

    public MyWorld() //al iniciar el mundo (no hay necesidad de darle run)
    {    
        super(600, 400, 1); 
        setPaintOrder(Title.class, Shrimp_clean.class);
        addObject(title,300,180);
        prepare(); //preparar el mundo
        camarones_L(); //generar camarones limpios
        camarones_E(); //generar camarones envenenados
    }
    
    public void act() //al darle a run
    {
        music.playLoop();
        music.setVolume(45);
        removeObject(title);
        showText("" + puntos, 575, 25); //mostrar los puntos
        // si se acaban los camarones
        if (cont == 0)
        {
            cont = 6; //el contador de camarones se reinicia
            camarones_L(); //genera otros 6 camarones
            camaron_EE(); //genera el camaron envenenado extra
        }
        if (corazones == 2) //perdió una vida
        {
            removeObject(heart3);
        }
        if (corazones == 1) //perdió dos vidas
        {
            removeObject(heart2);
        }
        if (corazones == 0) //perdió las tres vidas
        {
            removeObject(heart);
            addObject(game_over, 295,190);
            Greenfoot.stop();
            music.stop();
        }
    }
    
    public int rnd(int ini,int fin) //función para obtener numeros random dentro de un rango
    {
        int num = Greenfoot.getRandomNumber(fin - ini +1);
        return num + ini;
    }
    
    // instancia de objetos
    Heart heart = new Heart();
    Heart heart2 = new Heart();
    Heart heart3 = new Heart();
    Kiano kiano = new Kiano();
    Title title = new Title();
    Shrimp_poisoned shrimp_poisoned = new Shrimp_poisoned();
    Shrimp_clean shrimp_clean = new Shrimp_clean();
    Game_over game_over = new Game_over();
        
    public void prepare() //prepara el mundo (instancia los camarones y a kiano, ademas de colocarlo)
    {
        //agregar objetos (kiano y corazones)
        addObject(kiano,45,45);
        addObject(heart,460,30);
        addObject(heart2,430,30);
        addObject(heart3,400,30);
        showText("Score:", 530, 25); //muestra "score"
        puntos = 0; //reinicia el contador de puntos
        corazones = 3; //reinicia los corazones
        cont = 6; //renicia los camarones
        music.stop();
    }  
    
    public void camarones_L() //generación random de camarones limpios
    {
        for (int i = 0; i < 6; i++) //genera 6
        {
            int xc = rnd(75,550);
            int yc = rnd(75,350);
            addObject(new Shrimp_clean(), xc, yc);
        } 
    }
    public void camarones_E() //generación random de camarones envenenados
    {
        for (int i = 0; i < 4; i++) //genera 4 
        {
            int xc = rnd(75,550);
            int yc = rnd(75,350);
            addObject(new Shrimp_poisoned(), xc, yc);
        } 
    }
    public void camaron_EE() //genera 1 camaron envenenado extra para la siguiente ronda
    {
        int xc = rnd(75,550);
        int yc = rnd(75,350);
        addObject(new Shrimp_poisoned(), xc, yc);
    }
    
}
