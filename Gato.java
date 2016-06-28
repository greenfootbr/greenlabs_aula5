import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato extends Actor
{
    public int proximoPasso = 2;
    
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setImage(new GreenfootImage("personagens/gato/ze_"+proximoPasso+".png"));
        proximoPasso++;
        if(proximoPasso > 6){
            proximoPasso = 1;
        }
    }    
}
