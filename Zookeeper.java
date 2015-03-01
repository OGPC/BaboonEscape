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
    int animation=1;
    int animationDelay;
    
    
    GreenfootImage right1 = new GreenfootImage("right1.png");
    GreenfootImage right2 = new GreenfootImage("right2.png");
    GreenfootImage right3 = new GreenfootImage("right3.png");

    GreenfootImage left1 = new GreenfootImage("left1.png");
    GreenfootImage left2 = new GreenfootImage("left2.png");
    GreenfootImage left3 = new GreenfootImage("left3.png");

    /**
     * Act - do whatever the Zookeeper1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if(status ==2)
        {
            setLocation (getX()-2,getY());
            animationDelay++;

            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(left1);

                }

                if(animation==2)
                {
                    setImage(left2);

                }

                if(animation==3)
                {
                    setImage(left1);

                }

                if(animation==4)
                {
                    setImage(left3);
                    animation=0;
                }
                animation++;
                animationDelay=0;
            }
        }
        else
        {
            setLocation (getX()+2,getY());
            animationDelay++;
            if( animationDelay%4 ==0)
            {
                if(animation==1)
                {
                    setImage(right1);

                }

                if(animation==2)
                {
                    setImage(right2);

                }

                if(animation==3)
                {
                    setImage(right1);

                }

                if(animation==4)
                {
                    setImage(right3);
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
        if(status==1 && canSeeRight(Wall.class))
        {
            status=2;
        }
        
        if(status==2 && canSeeLeft(Wall.class))
        {
            status=1;
        }
    }

    public boolean canSeeLeft(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(-25, 0, clss); 
        return actor != null; 
    }

    public boolean canSeeRight(Class clss) 
    {
        Actor actor = getOneObjectAtOffset(25, 0, clss); 
        return actor != null; 
    }


   
}
