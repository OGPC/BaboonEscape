import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WORLDSIX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WORLDSIX extends World
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

    int wallNum5 = 0;
    int wallX5 = 125;
    int wallY5 = 125;

    int wallNum6 = 0;
    int wallX6 = 325;
    int wallY6 = 125;

    int wallNum7 = 0;
    int wallX7 = 475;
    int wallY7 = 125;

    int wallNum8 = 0;
    int wallX8 = 125;
    int wallY8 = 175;

    int wallNum9 = 0;
    int wallX9 = 375;
    int wallY9 = 175;

    int wallNum10 = 0;
    int wallX10 = 975;
    int wallY10 = 175;

    int wallNum11 = 0;
    int wallX11 = 225;
    int wallY11 = 225;

    int wallNum12 = 0;
    int wallX12 = 375;
    int wallY12 = 225;

    int wallNum13 = 0;
    int wallX13 = 75;
    int wallY13 = 325;

    int wallNum14 = 0;
    int wallX14 = 375;
    int wallY14 = 325;

    int wallNum15 = 0;
    int wallX15 = 575;
    int wallY15 = 325;

    int wallNum16 = 0;
    int wallX16 = 925;
    int wallY16 = 325;

    int wallNum17 = 0;
    int wallX17 = 1025;
    int wallY17 = 325;

    int wallNum18 = 0;
    int wallX18 = 725;
    int wallY18 = 375;

    int wallNum19 = 0;
    int wallX19 = 125;
    int wallY19 = 425;

    int wallNum20 = 0;
    int wallX20 = 525;
    int wallY20 = 425;

    int wallNum21 = 0;
    int wallX21 = 125;
    int wallY21 = 475;

    int wallNum22 = 0;
    int wallX22 = 625;
    int wallY22 = 475;

    int wallNum23 = 0;
    int wallX23 = 425;
    int wallY23 = 525;

    int wallNum24 = 0;
    int wallX24 = 575;
    int wallY24 = 575;

    int wallNum25 = 0;
    int wallX25 = 75;
    int wallY25 = 575;

    int wallNum26 = 0;
    int wallX26 = 725;
    int wallY26 = 625;

    int wallNum27 = 0;
    int wallX27 = 175;
    int wallY27 = 675;

    int wallNum28 = 0;
    int wallX28 = 125;
    int wallY28 = 675;

    int wallNum29 = 0;
    int wallX29 = 125;
    int wallY29 = 925;

    int wallNum30 = 0;
    int wallX30 = 225;
    int wallY30 = 775;

    int wallNum31 = 0;
    int wallX31 = 375;
    int wallY31 = 725;

    int wallNum32 = 0;
    int wallX32 = 425;
    int wallY32 = 875;

    int wallNum33 = 0;
    int wallX33 = 275;
    int wallY33 = 875;

    int wallNum34 = 0;
    int wallX34 = 525;
    int wallY34 = 725;

    int wallNum35 = 0;
    int wallX35 = 975;
    int wallY35 = 775;

    int wallNum36 = 0;
    int wallX36 = 625;
    int wallY36 = 825;

    int wallNum37 = 0;
    int wallX37 = 725;
    int wallY37 = 775;

    int wallNum38 = 0;
    int wallX38 = 825;
    int wallY38 = 825;
    
    int wallNum39 = 0;
    int wallX39 = 825;
    int wallY39 = 625;
    
    int wallNum40 = 0;
    int wallX40 = 425;
    int wallY40 = 975;
    
    int wallNum41 = 0;
    int wallX41 = 275;
    int wallY41 = 525;
    

    /**
     * Constructor for objects of class WORLDSIX.
     * 
     */
    public WORLDSIX()
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

        while( wallNum5<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX5,wallY5);
            wallX5= wallX5+50;
            wallNum5=wallNum5 + 1;
        }

        while( wallNum6<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX6,wallY6);
            wallY6= wallY6+50;
            wallNum6=wallNum6 + 1;
        }

        while( wallNum7<11)
        {
            Wall wall=new Wall();
            addObject(wall,wallX7,wallY7);
            wallX7= wallX7 +50;
            wallNum7=wallNum7 + 1;
        }

        while( wallNum8<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX8,wallY8);
            wallY8= wallY8+50;
            wallNum8=wallNum8 + 1;
        }

        while( wallNum9<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX9,wallY9);
            wallY9= wallY9+50;
            wallNum9=wallNum9 + 1;
        }

        while( wallNum10<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX10,wallY10);
            wallY10= wallY10+50;
            wallNum10=wallNum10 + 1;
        }

        while( wallNum11<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX11,wallY11);
            wallX11= wallX11+50;
            wallNum11=wallNum11 + 1;
        }

        while( wallNum12<11)
        {
            Wall wall=new Wall();
            addObject(wall,wallX12,wallY12);
            wallX12= wallX12+50;
            wallNum12=wallNum12 + 1;
        }

        while( wallNum13<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX13,wallY13);
            wallX13= wallX13+50;
            wallNum13=wallNum13 + 1;
        }

        while( wallNum14<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX14,wallY14);
            wallY14= wallY14+50;
            wallNum14=wallNum14 + 1;
        }

        while( wallNum15<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX15,wallY15);
            wallX15= wallX15+50;
            wallNum15=wallNum15 + 1;
        }

        while( wallNum16<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX16,wallY16);
            wallX16= wallX16+50;
            wallNum16=wallNum16 + 1;
        }

        while( wallNum17<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX17,wallY17);
            wallX17= wallX17+50;
            wallNum17=wallNum17 + 1;
        }

        while( wallNum18<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX18,wallY18);
            wallX18= wallX18+50;
            wallNum18=wallNum18 + 1;
        }

        while( wallNum19<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX19,wallY19);
            wallX19= wallX19+50;
            wallNum19=wallNum19 + 1;
        }

        while( wallNum20<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX20,wallY20);
            wallX20= wallX20+50;
            wallNum20=wallNum20 + 1;
        }

        while( wallNum21<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX21,wallY21);
            wallX21= wallX21+50;
            wallNum21=wallNum21 + 1;
        }

        while( wallNum22<8)
        {
            Wall wall=new Wall();
            addObject(wall,wallX22,wallY22);
            wallX22= wallX22+50;
            wallNum22=wallNum22 + 1;
        }

        while( wallNum23<3)
        {
            Wall wall=new Wall();
            addObject(wall,wallX23,wallY23);
            wallY23= wallY23+50;
            wallNum23=wallNum23 + 1;
        }

        while( wallNum24<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX24,wallY24);
            wallX24= wallX24+50;
            wallNum24=wallNum24 + 1;
        }

        while( wallNum25<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX25,wallY25);
            wallX25= wallX25+50;
            wallNum25=wallNum25 + 1;
        }

        while( wallNum26<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX26,wallY26);
            wallX26= wallX26+50;
            wallNum26=wallNum26 + 1;
        }

        while( wallNum27<7)
        {
            Wall wall=new Wall();
            addObject(wall,wallX27,wallY27);
            wallY27= wallY27+50;
            wallNum27=wallNum27 + 1;
        }

        while( wallNum28<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX28,wallY28);
            wallY28= wallY28+50;
            wallNum28=wallNum28 + 1;
        }

        while( wallNum29<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX29,wallY29);
            wallY29= wallY29+50;
            wallNum29=wallNum29 + 1;
        }

        while( wallNum30<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX30,wallY30);
            wallX30= wallX30+50;
            wallNum30=wallNum30 + 1;
        }

        while( wallNum31<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX31,wallY31);
            wallY31= wallY31+50;
            wallNum31=wallNum31 + 1;
        }

        while( wallNum32<1)
        {
            Wall wall=new Wall();
            addObject(wall,wallX32,wallY32);
            wallY32= wallY32+50;
            wallNum32=wallNum32 + 1;
        }

        while( wallNum33<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX33,wallY33);
            wallY33= wallY33+50;
            wallNum33=wallNum33 + 1;
        }

        while( wallNum34<10)
        {
            Wall wall=new Wall();
            addObject(wall,wallX34,wallY34);
            wallX34= wallX34+50;
            wallNum34=wallNum34 + 1;
        }

        while( wallNum35<6)
        {
            Wall wall=new Wall();
            addObject(wall,wallX35,wallY35);
            wallY35= wallY35+50;
            wallNum35=wallNum35 + 1;
        }

        while( wallNum36<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX36,wallY36);
            wallY36= wallY36+50;
            wallNum36=wallNum36 + 1;
        }

        while( wallNum37<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX37,wallY37);
            wallY37= wallY37+50;
            wallNum37=wallNum37 + 1;
        }

        while( wallNum38<5)
        {
            Wall wall=new Wall();
            addObject(wall,wallX38,wallY38);
            wallY38= wallY38+50;
            wallNum38=wallNum38 + 1;
        }
        
         while( wallNum39<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX39,wallY39);
            wallX39= wallX39+50;
            wallNum39=wallNum39 + 1;
        }
        
        while( wallNum40<2)
        {
            Wall wall=new Wall();
            addObject(wall,wallX40,wallY40);
            wallY40 = wallY40+50;
            wallNum40=wallNum40 + 1;
        }
        
        while( wallNum41<4)
        {
            Wall wall=new Wall();
            addObject(wall,wallX41,wallY41);
            wallY41 = wallY41+50;
            wallNum41=wallNum41 + 1;
        }
    }
    }
