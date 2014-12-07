import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldONE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTutorial extends World
{
    // 1 is top row
    // 2 is bottom row
    //3 is left column
   int wallNum1=0;
   int wallX1=25;
   int wallY1=25;
   
   int wallX2=25;
   int wallY2=725;
   int wallNum2=0;
   
   int wallNum3=0;
   int wallX3=25;
   int wallY3 = 75;
   
   int wallNum4=0;
   int wallX4=725;
   int wallY4 = 75;
   
   // r stands for row
   // c stand for column
   // number represents the specific object
   int wallR1X= 275;
   int wallR1Y= 175;
   int wallNumR1=0;
   
   

    /**
     * Constructor for objects of class WorldONE.
     * 
     */
    public WorldTutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
         

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Character character = new Character();
        addObject(character, 75, 75);
        
        Zookeeper zookeeper= new Zookeeper();
        addObject(zookeeper,75,225);
        //Wall wall1=new Wall();
        //addObject(wall1,25,25);
        while( wallNum1<15)
        {
            Wall wall=new Wall();
            addObject(wall,wallX1,wallY1);
            wallX1= wallX1+50;
            wallNum1=wallNum1 + 1;
        }
        
         while( wallNum2<15)
        {
            Wall wall=new Wall();
            addObject(wall,wallX2,wallY2);
            wallX2= wallX2+50;
            wallNum2=wallNum2 + 1;
        }
        
         while( wallNum3<13)
        {
            Wall wall=new Wall();
            addObject(wall,wallX3,wallY3);
            wallY3= wallY3+50;
            wallNum3=wallNum3 + 1;
        }
         
        while( wallNum4<13)
        {
            Wall wall=new Wall();
            addObject(wall,wallX4,wallY4);
            wallY4= wallY4+50;
            wallNum4=wallNum4 + 1;
        }
        
        
        while( wallNumR1<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallR1X,wallR1Y);
            wallR1X= wallR1X+50;
            wallNumR1=wallNumR1 + 1;
        }
        
    }
}
