import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDTWO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDTWO extends World
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
    int wallY5=175;

    int wallNum6=0;
    int wallX6=375;
    int wallY6=175;

    int wallNum7=0;
    int wallX7=575;
    int wallY7=175;

    int wallNum8=0;
    int wallX8=275;
    int wallY8=225;

    int wallNum9=0;
    int wallX9=375;
    int wallY9=225;

    int wallNum10=0;
    int wallX10=75;
    int wallY10=325;

    int wallNum11=0;
    int wallX11=375;
    int wallY11=325;

    int wallNum12=0;
    int wallX12=875;
    int wallY12=325;

    int wallNum13=0;
    int wallX13=275;
    int wallY13=375;

    int wallNum14=0;
    int wallX14=775;
    int wallY14=375;

    int wallNum15=0;
    int wallX15=125;
    int wallY15=425;

    int wallNum16=0;
    int wallX16=425;
    int wallY16=425;

    int wallNum17=0;
    int wallX17=775;
    int wallY17=425;

    int wallNum18=0;
    int wallX18=125;
    int wallY18=475;

    int wallNum19=0;
    int wallX19=275;
    int wallY19=475;

    int wallNum20=0;
    int wallX20=375;
    int wallY20=425;

    int wallNum21=0;
    int wallX21=275;
    int wallY21=525;

    int wallNum22=0;
    int wallX22=225;
    int wallY22=575;

    int wallNum23=0;
    int wallX23=575;
    int wallY23=625;

    int wallNum24=0;
    int wallX24=775;
    int wallY24=625;

    int wallNum25=0;
    int wallX25=475;
    int wallY25=725;

    int wallNum26=0;
    int wallX26=125;
    int wallY26=775;

    int wallNum27=0;
    int wallX27=125;
    int wallY27=825;

    int wallNum28=0;
    int wallX28=575;
    int wallY28=825;

    int wallNum29=0;
    int wallX29=225;
    int wallY29=875;

    int wallNum30=0;
    int wallX30=625;
    int wallY30=925;

    int wallNum31=0;
    int wallX31=225;
    int wallY31=1025;

    /**
     * Constructor for objects of class WORLDTWO.
     * 
     */
    public WORLDTWO()
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

        while( wallNum5<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallX5= wallX5+50;
            wallNum5=wallNum5 + 1;
        }

        while( wallNum6<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallX6= wallX6+50;
            wallNum6=wallNum6 + 1;
        }

        while( wallNum7<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7+50;
            wallNum7=wallNum7 + 1;
        }

        while( wallNum8<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallX8= wallX8+50;
            wallNum8=wallNum8 + 1;
        }

        while( wallNum9<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallX9= wallX9+50;
            wallNum9=wallNum9 + 1;
        }

        while( wallNum10<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallX10= wallX10+50;
            wallNum10=wallNum10 + 1;
        }

        while( wallNum11<9)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallX11= wallX11+50;
            wallNum11=wallNum11 + 1;
        }

        while( wallNum12<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12, wallY12);
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }

        while( wallNum13<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13, wallY13);
            wallX13= wallX13+50;
            wallNum13=wallNum13 + 1;
        }

        while( wallNum14<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14, wallY14);
            wallX14= wallX14+50;
            wallNum14=wallNum14 + 1;
        }

        while( wallNum15<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15, wallY15);
            wallX15= wallX15+50;
            wallNum15=wallNum15 + 1;
        } 

        while( wallNum16<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16, wallY16);
            wallX16= wallX16+50;
            wallNum16=wallNum16 + 1;
        } 

        while( wallNum17<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX17, wallY17);
            wallX17= wallX17+50;
            wallNum17=wallNum17 + 1;
        } 

        while( wallNum18<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX18, wallY18);
            wallX18= wallX18+50;
            wallNum18=wallNum18 + 1;
        } 

        while( wallNum19<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX19, wallY19);
            wallX19= wallX19+50;
            wallNum19=wallNum19 + 1;
        } 

        while( wallNum20<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX20, wallY20);
            wallX20= wallX20+50;
            wallNum20=wallNum20 + 1;
        } 

        while( wallNum21<16)
        {
            Wall wall=new Wall();
            addObject(wall,wallX21, wallY21);
            wallX21= wallX21+50;
            wallNum21=wallNum21 + 1;
        } 

        while( wallNum22<17)
        {
            Wall wall=new Wall();
            addObject(wall,wallX22, wallY22);
            wallX22= wallX22+50;
            wallNum22=wallNum22 + 1;
        }

        while( wallNum23<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX23, wallY23);
            wallY23= wallY23+50;
            wallNum23=wallNum23 + 1;
        }

        while( wallNum24<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX24, wallY24);
            wallY24= wallY24+50;
            wallNum24=wallNum24 + 1;
        }

        while( wallNum25<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX25, wallY25);
            wallY25= wallY25+50;
            wallNum25=wallNum25 + 1;
        }

        while( wallNum26<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX26, wallY26);
            wallX26= wallX26+50;
            wallNum26=wallNum26 + 1;
        }

        while( wallNum27<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX27, wallY27);
            wallX27= wallX27+50;
            wallNum27=wallNum27 + 1;
        }

        while( wallNum28<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX28, wallY28);
            wallX28= wallX28+50;
            wallNum28=wallNum28 + 1;
        }

        while( wallNum29<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX29, wallY29);
            wallX29= wallX29+50;
            wallNum29=wallNum29 + 1;
        }

        while( wallNum30<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX30, wallY30);
            wallX30= wallX30+50;
            wallNum30=wallNum30 + 1;
        }

        while( wallNum31<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX31, wallY31);
            wallX31= wallX31+50;
            wallNum31=wallNum31 + 1;
        }
    }
}

