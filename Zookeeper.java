import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zookeeper1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zookeeper extends Actor
{
    int frame = 0;
    private int animationCount;
    private int vSpeed = 0;
    private int acceleration = 2;

    private int speed = 1;

    private int spriteHeight = getImage().getHeight();
    private int spriteWidth = getImage().getWidth();
    private int lookForGroundDistance = (int)spriteHeight/2;
    private int lookForEdge = (int)spriteWidth/2;
    GreenfootImage run1l = new GreenfootImage("run1l.png");
    GreenfootImage run2l = new GreenfootImage("run2l.png");
    GreenfootImage run3l = new GreenfootImage("run3l.png");
    GreenfootImage run4l = new GreenfootImage("run4l.png");

    GreenfootImage run1r = new GreenfootImage("run1r.png");
    GreenfootImage run2r = new GreenfootImage("run2r.png");
    GreenfootImage run3r = new GreenfootImage("run3r.png");
    GreenfootImage run4r = new GreenfootImage("run4r.png");

    int status=1; 
    /**
     * Act - do whatever the Zookeeper1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setAnimation();
        animationCount ++;
        if(status ==1)
        {
            setLocation (getX()+2,getY());
           animateRight();
        }
        else
        {
            setLocation (getX()-2,getY());
            animateLeft();
        }
        changeStatus();
        
        checkRightWalls();
        checkLeftWalls();

    }
    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, Wall.class);
        if(rightWall == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(rightWall);
            return true;
        }
        
    }

    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());
        speed *= -1;
        
    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, Wall.class);
        if(leftWall == null)
        {
            return false;
            
        }
        else
        {
            stopByLeftWall(leftWall);
            return true;
        }
       
    }

    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
        speed *= -1;
        

    }

    public void setAnimation()
    {
        if(speed<0)
        {
            if(animationCount % 4 == 0)
                animateLeft();
        }
        else
        {
            if(animationCount % 4 == 0)
                animateRight();
        }
    }

    public void animateLeft()
    {
        if(frame == 0)
        {
            setImage(run1l);
        }
        if(frame == 1)
        {
            setImage(run2l);
        }
        if(frame == 2)
        {
            setImage(run3l);
        }
        if(frame == 3)
        {
            setImage(run4l);
            frame = 0;
        }
        frame++;
    }

    public void animateRight()
    {
        if(frame == 0)
        {
            setImage(run1r);
        }
        if(frame == 1)
        {
            setImage(run2r);
        }
        if(frame == 2)
        {
            setImage(run3r);
        }
        if(frame == 3)
        {
            setImage(run4r);
            frame = 0;
        }
        frame++;
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
     
        
    }//

    public boolean canSeeLeft(Class clss)
    {
        Actor actor= getOneObjectAtOffset(-25,0,clss);
        return actor !=null;
     
    }
    
}
