import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{

    /**
     * Constructor for objects of class play.
     * 
     */
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        frog frog = new frog();
        addObject(frog,185,530);
    }
    public void act(){
    if(Greenfoot.getRandomNumber(500)<3){
    addObject(new teratai(),Greenfoot.getRandomNumber(1000),1);
    }
    if(Greenfoot.getRandomNumber(500)<3){
    addObject(new snake(),Greenfoot.getRandomNumber(1000),1);
    }
    
} 
    
}


    


