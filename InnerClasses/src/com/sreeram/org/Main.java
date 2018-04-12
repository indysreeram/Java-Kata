package com.sreeram.org;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

/*        GearBox mcLaren = new GearBox(5);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelsSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelsSpeed(1000));*/


/*        class ClickListener implements Button.OnClickListener {
            public  ClickListener() {
                System.out.println("I have been attacehed");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }*/

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was Clicked");
            }
        });
        listen();

    }

    public static void listen() {
        boolean quit =false;
        int choice;
        while(!quit){
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
