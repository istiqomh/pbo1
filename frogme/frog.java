import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frog extends Actor
{   
    int gravity = 5;
    /**
     * Act - do whatever the frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void setGravity(int gravity){
           this.gravity = gravity;
       }
       
       public void act(){
       
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
        }
        
        if(Greenfoot.isKeyDown("space")){
            this .setLocation(getX()+5,getY()-5);
        }
        
        if(Greenfoot.isKeyDown("up")){
            this.setLocation(getX() , getY());
        }
        teratai a = (teratai)getOneIntersectingObject(teratai.class);
        if (a!=null){
        getWorld().removeObject(a);
        }
        snake b = (snake)getOneIntersectingObject(snake.class);
        if (b!=null){
        getWorld().removeObject(b);
}
}
}

