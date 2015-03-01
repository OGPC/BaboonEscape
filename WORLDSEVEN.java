import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDSEVEN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDSEVEN extends World
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
    int wallY5=225;
    
    int wallNum6=0;
    int wallX6=675;
    int wallY6=225;
    
    int wallNum7=0;
    int wallX7=875;
    int wallY7=225;
    
    int wallNum8=0;
    int wallX8=475;
    int wallY8=275;
    
    int wallNum9=0;
    int wallX9=475;
    int wallY9=575;
    
    int wallNum10=0;
    int wallX10=475;
    int wallY10=925;
    
    int wallNum11=0;
    int wallX11=75;
    int wallY11=425;
    
    int wallNum12=0;
    int wallX12=275;
    int wallY12=625;
    
    int wallNum13=0;
    int wallX13=75;
    int wallY13=725;
    
    int wallNum14=0;
    int wallX14=275;
    int wallY14=925;
    
    int wallNum15=0;
    int wallX15=525;
    int wallY15=375;
    
    int wallNum16=0;
    int wallX16=725;
    int wallY16=625;
    
    int wallNum17=0;
    int wallX17=525;
    int wallY17=825;
    
    int wallNum18=0;
    int wallX18=225;
    int wallY18=175;
    
    int wallNum19=0;
    int wallX19=225;
    int wallY19=275;
    
    /**
     * Constructor for objects of class WORLDSIX.
     * 
     */
    public WORLDSEVEN()
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
       
        while( wallNum5<11)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallX5= wallX5+50;
            wallNum5=wallNum5 + 1;
        }
        
        while( wallNum6<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallX6= wallX6+50;
            wallNum6=wallNum6 + 1;
        }
        
        while( wallNum7<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }
        
        while( wallNum8<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallY8= wallY8+50;
            wallNum8=wallNum8 + 1;
        }
        
        while( wallNum9<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallY9= wallY9+50;
            wallNum9=wallNum9 + 1;
        }
        
        while( wallNum10<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallY10= wallY10+50;
            wallNum10=wallNum10 + 1;
        }
        
        while( wallNum11<4)
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
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }
        
        while( wallNum13<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallX13= wallX13+50;
            wallNum13=wallNum13 + 1;
        }
        
        while( wallNum14<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallX14= wallX14+50;
            wallNum14=wallNum14 + 1;
        }
        
        while( wallNum15<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15,wallY15);
            wallX15= wallX15+50;
            wallNum15=wallNum15 + 1;
        }
        
        while( wallNum16<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16,wallY16);
            wallX16= wallX16+50;
            wallNum16=wallNum16 + 1;
        }
        
         while( wallNum17<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX17,wallY17);
            wallX17= wallX17+50;
            wallNum17=wallNum17 + 1;
        }
        
        while( wallNum18<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX18,wallY18);
            wallX18= wallX18+50;
            wallNum18=wallNum18 + 1;
        }
        
        while( wallNum19<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX19,wallY19);
            wallX19= wallX19+50;
            wallNum19=wallNum19 + 1;
        }
    }
}
