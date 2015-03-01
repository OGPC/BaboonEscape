import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zookeeper2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zookeeper2 extends Actor
{
    int status=1; 
    int animation=1;
    int animationDelay;
    
    
    GreenfootImage down1 = new GreenfootImage("down1.png");
    GreenfootImage down2 = new GreenfootImage("down2.png");
    GreenfootImage down3 = new GreenfootImage("down3.png");

    GreenfootImage up1 = new GreenfootImage("up1.png");
    GreenfootImage up2 = new GreenfootImage("up2.png");
    GreenfootImage up3 = new GreenfootImage("up3.png");

    /**
     * Act - do whatever the Zookeeper1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(status ==1)
        {
            setLocation (getX(),getY()-2);
            animationDelay++;

            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(up1);

                }

                if(animation==2)
                {
                    setImage(up2);

                }

                if(animation==3)
                {
                    setImage(up1);

                }

                if(animation==4)
                {
                    setImage(up3);
                    animation=0;
                }
                animation++;
                animationDelay=0;
            }
        }
        else
        {
            setLocation (getX(),getY()+2);
            animationDelay++;
            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(down1);

                }

                if(animation==2)
                {
                    setImage(down2);

                }

                if(animation==3)
                {
                    setImage(down1);

                }

                if(animation==4)
                {
                    setImage(down3);
                    animation=0;
                }
                animation++;
                animationDelay=0;
            }
        }
        changeStatus();
        //changeImage();

    }

   

    public void changeStatus()
    {
        if(status==1 && canSeeUp(Wall.class))
        {
            status=2;
        }
        
        if(status==2 && canSeeDown(Wall.class))
        {
            status=1;
        }
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
