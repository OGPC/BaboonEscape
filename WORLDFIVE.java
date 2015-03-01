import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDFIVE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDFIVE extends World
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
    int wallX5 =75;
    int wallY5 =25;
    
    int wallNum6=0;
    int wallX6 = 225;
    int wallY6 = 75;
    
    int wallNum7=0;
    int wallX7 = 275;
    int wallY7 = 425;
    
    int wallNum8=0;
    int wallX8 = 325;
    int wallY8 = 125;
    
    int wallNum9=0;
    int wallX9 = 425;
    int wallY9 = 125;
    
    int wallNum10=0;
    int wallX10 = 425;
    int wallY10 = 225;
    
    int wallNum11=0;
    int wallX11 = 75;
    int wallY11 = 525;
    
    int wallNum12=0;
    int wallX12 = 475;
    int wallY12 = 225;
    
    int wallNum13=0;
    int wallX13 = 625;
    int wallY13 = 225;
    
    int wallNum14=0;
    int wallX14 = 525;
    int wallY14 = 275;
    
    int wallNum15=0;
    int wallX15 = 675;
    int wallY15 = 325;
       
    int wallNum16=0;
    int wallX16 = 525;
    int wallY16 = 425;
    
    int wallNum17=0;
    int wallX17 = 475;
    int wallY17 = 975;
    
    int wallNum18=0;
    int wallX18 = 675;
    int wallY18 = 425;
    
    int wallNum19=0;
    int wallX19 = 775;
    int wallY19 = 425;
    
    int wallNum20=0;
    int wallX20 = 925;
    int wallY20 = 425;
       
    int wallNum21=0;
    int wallX21 = 675;
    int wallY21 = 975;
    
    int wallNum22=0;
    int wallX22 = 825;
    int wallY22 = 975;
    
    int wallNum23=0;
    int wallX23 = 975;
    int wallY23 = 975;
    
    int wallNum24=0;
    int wallX24 = 575;
    int wallY24 = 925;
    
    int wallNum25=0;
    int wallX25 = 125;
    int wallY25 = 825;
    
    int wallNum26=0;
    int wallX26 = 125;
    int wallY26 = 625;
       
       
    /**
     * Constructor for objects of class WORLD5.
     * 
     */
    public WORLDFIVE()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 1100, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
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
        
        while( wallNum5<21)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallX5= wallX5+50;
            wallNum5=wallNum5 + 1;
        }
        
         while( wallNum6<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }
        
         while( wallNum7<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }
        
        while( wallNum8<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallY8= wallY8+50;
            wallNum8=wallNum8 + 1;
        }
        
        while( wallNum9<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallX9= wallX9+50;
            wallNum9=wallNum9 + 1;
        }
        
        while( wallNum10<16)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallY10= wallY10+50;
            wallNum10=wallNum10 + 1;
        }
        
        while( wallNum11<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallX11= wallX11+50;
            wallNum11=wallNum11 + 1;
        }
        
        while( wallNum12<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }
        
        while( wallNum13<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallY13= wallY13+50;
            wallNum13=wallNum13 + 1;
        }
        
        while( wallNum14<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallY14= wallY14+50;
            wallNum14=wallNum14 + 1;
        }
        
        while( wallNum15<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15,wallY15);
            wallX15= wallX15+50;
            wallNum15=wallNum15 + 1;
        }
        
        while( wallNum16<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16,wallY16);
            wallY16= wallY16+50;
            wallNum16=wallNum16 + 1;
        }
        
        while( wallNum17<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX17,wallY17);
            wallX17= wallX17+50;
            wallNum17=wallNum17 + 1;
        }
        
        while( wallNum18<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX18,wallY18);
            wallY18= wallY18+50;
            wallNum18=wallNum18 + 1;
        }
        
        while( wallNum19<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX19,wallY19);
            wallY19= wallY19+50;
            wallNum19=wallNum19 + 1;
        }
        
        while( wallNum20<12)
        {
            Wall wall=new Wall();
            addObject(wall,wallX20,wallY20);
            wallY20= wallY20+50;
            wallNum20=wallNum20 + 1;
        }
        
        while( wallNum21<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX21,wallY21);
            wallX21= wallX21+50;
            wallNum21=wallNum21 + 1;
        }
        
        while( wallNum22<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX22,wallY22);
            wallX22= wallX22+50;
            wallNum22=wallNum22 + 1;
        }
        
        while( wallNum23<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX23,wallY23);
            wallX23= wallX23+50;
            wallNum23=wallNum23 + 1;
        }
        
        while( wallNum24<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX24,wallY24);
            wallX24= wallX24+50;
            wallNum24=wallNum24 + 1;
        }
        
        while( wallNum25<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX25,wallY25);
            wallY25= wallY25+50;
            wallNum25=wallNum25 + 1;
        }
        
        while( wallNum26<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX26,wallY26);
            wallY26= wallY26+50;
            wallNum26=wallNum26 + 1;
        }
    }    
}
