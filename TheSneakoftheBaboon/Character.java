import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveLeft();
        moveRight();
        moveUp();
        moveDown();

    }

    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("left")&& !canSeeLeft(Wall.class) && !canSeeLeftUp(Wall.class) && !canSeeLeftDown(Wall.class) )
        {
            setLocation (getX()-2,getY());
        }
        else if((Greenfoot.isKeyDown("left")))
        {
            setLocation (getX()+5,getY())  ;
            Greenfoot.delay(7);
        }
    }

    public void moveRight()
    {
        if(Greenfoot.isKeyDown("right")&& !canSeeRight(Wall.class) && !canSeeRightUp(Wall.class) && !canSeeRightDown(Wall.class) )
        {
            setLocation (getX()+2,getY());
        }
        else if((Greenfoot.isKeyDown("right")))
        {
            setLocation (getX()-5,getY())  ;
            Greenfoot.delay(7);
        }
    }

    public void moveUp()
    {
        if(Greenfoot.isKeyDown("up")&& !canSeeUp(Wall.class)&&!canSeeRightUp(Wall.class)&&!canSeeLeftUp(Wall.class))
        {
            setLocation (getX(),getY()-2);
        }
        else if((Greenfoot.isKeyDown("up")))
        {
            setLocation (getX(),getY()+5)  ;
            Greenfoot.delay(7);
        }
    }

    public void moveDown()
    {
        if(Greenfoot.isKeyDown("down")&& !canSeeDown(Wall.class)&& !canSeeRightDown(Wall.class) && !canSeeLeftDown(Wall.class))
        {
            setLocation (getX(),getY()+2);
        }
        else if((Greenfoot.isKeyDown("down")))
        {
            setLocation (getX(),getY()-5)  ;
            Greenfoot.delay(7);
        }
    }

    public boolean canSeeLeft(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, 0, clss); 
        return actor != null; 
    }
    
     public boolean canSeeLeftDown(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, 25, clss); 
        return actor != null; 
    }
    
     public boolean canSeeLeftUp(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, -25, clss); 
        return actor != null; 
    }
    
    
    public boolean canSeeRight(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, 0, clss); 
        return actor != null; 
    }
    
    public boolean canSeeRightUp(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, -25, clss); 
        return actor != null; 
    }
    
    public boolean canSeeRightDown(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, 25, clss); 
        return actor != null; 
    }
    
    public boolean canSeeUp(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, -25, clss); 
        return actor != null; 
    }
    
    
    public boolean canSeeDown(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(0, 25, clss); 
        return actor != null; 
    }
    

}
