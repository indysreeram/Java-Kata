package com.sreeram.org;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast","Acer",27,  new Resolution(2540,1440));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMotherBoard,theMonitor);
         thePC.powerUP();
         thePC.getMotherBoard().loadProgram("Windows 10");
         thePC.getMonitor().drawPixelAt(500,1200,"red");
    }
}
