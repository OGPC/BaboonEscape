import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zookeeper1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zookeeper extends Actor
{
    int status=1; 
    /**
     * Act - do whatever the Zookeeper1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(status ==1)
        {
            setLocation (getX()+2,getY());
        }
        else
        {
            setLocation (getX()-2,getY());
        }
        changeStatus();

    
    }
    
    public void changeStatus()
    {
        if(status==1 && canSeeRight(Wall.class))
        {
            status=2;
        }
        if(status==2 && canSeeLeft(Wall.class))
        {
            status=1;
        }
    }
    
    public boolean canSeeRight(Class clss)
    {
        Actor actor= getOneObjectAtOffset(25,0,clss);
        return actor !=null;
    }
    
    public boolean canSeeLeft(Class clss)
    {
        Actor actor= getOneObjectAtOffset(-25,0,clss);
        return actor !=null;
    }
}
