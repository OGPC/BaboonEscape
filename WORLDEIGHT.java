import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDEIGHT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDEIGHT extends World
{
    int wallNum1=0;
    int wallX1=25;
    int wallY1=25;

    int wallX2=25;
    int wallY2=1075;
    int wallNum2=0;
    
    int wallNum3=0;
    int wallX3=25;
    int wallY3 = 75;

    int wallNum4=0;
    int wallX4=1075;
    int wallY4 = 75;
    
    int wallNum5=0;
    int wallX5=75;
    int wallY5 =175;
    
    int wallNum6=0;
    int wallX6=475;
    int wallY6 =175;
    
    int wallNum7=0;
    int wallX7=175;
    int wallY7=475;
    
    int wallNum8=0;
    int wallX8=525;
    int wallY8=425;
    
    int wallNum9=0;
    int wallX9=425;
    int wallY9=525;
    
    int wallNum10=0;
    int wallX10=425;
    int wallY10=775;
    
    int wallNum11=0;
    int wallX11=225;
    int wallY11=825;
    
    int wallNum12=0;
    int wallX12=425;
    int wallY12=925;
    
    int wallNum13=0;
    int wallX13=525;
    int wallY13=325;  
    
    int wallNum14=0;
    int wallX14=475;
    int wallY14=675; 
   
    
    
    /**
     * Constructor for objects of class WORLDSIX.
     * 
     */
    public WORLDEIGHT()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 1100, 1);  
        
        prepare();
    }
     private void prepare()
    {
        Character character = new Character();
        addObject(character, 75, 75);
        //Wall wall1=new Wall();
        //addObject(wall1,25,25);
        while( wallNum1<22)
        {
            Wall wall=new Wall();
            addObject(wall,wallX1,wallY1);
            wallX1= wallX1+50;
            wallNum1=wallNum1 + 1;
        }

        while( wallNum2<22)
        {
            Wall wall=new Wall();
            addObject(wall,wallX2,wallY2);
            wallX2= wallX2+50;
            wallNum2=wallNum2 + 1;
        }
         while( wallNum3<20)
        {
            Wall wall=new Wall();
            addObject(wall,wallX3,wallY3);
            wallY3= wallY3+50;
            wallNum3=wallNum3 + 1;
        }

        while( wallNum4<20)
        {
            Wall wall=new Wall();
            addObject(wall,wallX4,wallY4);
            wallY4= wallY4+50;
            wallNum4=wallNum4 + 1;
        }
        
        while( wallNum5<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallX5= wallX5+50;
            wallNum5=wallNum5 + 1;
        }
        
        while( wallNum6<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }
        
        while( wallNum7<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }
        
        while( wallNum8<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallX8= wallX8+50;
            wallNum8=wallNum8 + 1;
        }
        
         while( wallNum9<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallY9= wallY9+50;
            wallNum9=wallNum9 + 1;
        }
        
         while( wallNum10<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallY10= wallY10+50;
            wallNum10=wallNum10 + 1;
        }
        
        while( wallNum11<11)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallX11= wallX11+50;
            wallNum11=wallNum11 + 1;
        }
        
        while( wallNum12<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallY12= wallY12+50;
            wallNum12=wallNum12 + 1;
        }
        
        while( wallNum13<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallX13= wallX13+50;
            wallNum13=wallNum13 + 1;
        }
        
        while( wallNum14<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallX14= wallX14+50;
            wallNum14=wallNum14 + 1;
        }
    }
}
