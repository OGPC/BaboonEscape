import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDNINE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDNINE extends World
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
    int wallX5 = 175;
    int wallY5 = 175;
    
    int wallNum6=0;
    int wallX6 = 175;
    int wallY6 = 525;
    
    int wallNum7=0;
    int wallX7 = 175;
    int wallY7 = 875;
    
    int wallNum8=0;
    int wallX8 = 275;
    int wallY8 = 425;
       
    int wallNum9=0;
    int wallX9 = 375;
    int wallY9 = 325;
    
    int wallNum10=0;
    int wallX10 = 225;
    int wallY10 = 725;
    
    int wallNum11=0;
    int wallX11 = 375;
    int wallY11 = 775;
    
    int wallNum12=0;
    int wallX12 = 475;
    int wallY12 = 875;
    
    
    int wallNum14=0;
    int wallX14 = 475;
    int wallY14 = 175;
    
    int wallNum15=0;
    int wallX15 = 875;
    int wallY15 = 275;
    
    int wallNum16=0;
    int wallX16 = 500;
    int wallY16 = 600;
    /**
     * Constructor for objects of class WORLD9.
     * 
     */
    public WORLDNINE()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 1100, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
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
        
        while( wallNum5<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallY5= wallY5+50;
            wallNum5=wallNum5 + 1;
        }
        
        while( wallNum6<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }
        
        while( wallNum7<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallY7= wallY7+50;
            wallNum7=wallNum7 + 1;
        }
        
        while( wallNum8<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallY8= wallY8+50;
            wallNum8=wallNum8 + 1;
        }
        
        while( wallNum9<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallY9= wallY9+50;
            wallNum9=wallNum9 + 1;
        }
        
        while( wallNum10<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallX10= wallX10+50;
            wallNum10=wallNum10 + 1;
        }
        
        while( wallNum11<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallY11= wallY11+50;
            wallNum11=wallNum11 + 1;
        }
        
        while( wallNum12<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }
        
        
        
        while( wallNum14<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallX14= wallX14+50;
            wallNum14=wallNum14 + 1;
        }
        
        while( wallNum15<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15,wallY15);
            wallY15= wallY15+50;
            wallNum15=wallNum15 + 1;
        }
        
        while( wallNum16<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16,wallY16);
            wallX16= wallX16+50;
            wallNum16=wallNum16 + 1;
        }
    }
}
