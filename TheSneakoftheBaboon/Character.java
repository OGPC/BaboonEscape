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
        checkZooKeeper();
        checkLever();
        checkTrap();
        checkEndgate();

    }
    
    public void checkEndgate()
    {
        if(canSeeLeft(Endgate.class)&& !checkLockStatus()||canSeeRight(Endgate.class)&& !checkLockStatus()||canSeeUp(Endgate.class)&& !checkLockStatus()||canSeeDown(Endgate.class)&& !checkLockStatus())
        {
            Greenfoot.playSound("explosion.wav");
            Greenfoot.stop();
        }
    }
    
    public void checkTrap()
    {
        if(canSeeLeft(Trap.class)||canSeeRight(Trap.class)||canSeeUp(Trap.class)||canSeeDown(Trap.class))
        {
            Greenfoot.playSound("explosion.wav");
            Greenfoot.stop();
        }
    }

    public void checkLever()
    {
        if(canSeeLeft(Lever.class)&& checkLockStatus()||canSeeRight(Lever.class)&& checkLockStatus()||canSeeUp(Lever.class)&& checkLockStatus()||canSeeDown(Lever.class)&& checkLockStatus())
        {
            WorldTutorial.lockStatus =2;
            Greenfoot.playSound("buzz.wav");
        }
    }

    public  boolean checkLockStatus()
    {
        if(WorldTutorial.lockStatus==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void checkZooKeeper()
    {
        if(canSeeLeft(Zookeeper.class)||canSeeRight(Zookeeper.class)||canSeeUp(Zookeeper.class)||canSeeDown(Zookeeper.class))
        {
            Greenfoot.stop();
        }
    }

    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("left")&& !canSeeLeft(Wall.class) && !canSeeLeftUp(Wall.class) && !canSeeLeftDown(Wall.class) )
        {
            setLocation (getX()-2,getY());
        }

    }

    public void moveRight()
    {
        if(Greenfoot.isKeyDown("right")&& !canSeeRight(Wall.class) && !canSeeRightUp(Wall.class) && !canSeeRightDown(Wall.class) )
        {
            setLocation (getX()+2,getY());
        }

    }

    public void moveUp()
    {
        if(Greenfoot.isKeyDown("up")&& !canSeeUp(Wall.class)&&!canSeeRightUp(Wall.class)&&!canSeeLeftUp(Wall.class))
        {
            setLocation (getX(),getY()-2);
        }

    }

    public void moveDown()
    {
        if(Greenfoot.isKeyDown("down")&& !canSeeDown(Wall.class)&& !canSeeRightDown(Wall.class) && !canSeeLeftDown(Wall.class))
        {
            setLocation (getX(),getY()+2);
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
