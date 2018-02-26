package com.sreeram.org;

public class Main {

    public static void main(String[] args) {

/*        Player player = new Player();
        player.health =20;
        player.name ="Sreeram";
        player.weapon ="Sword";

        int damage = 10;
        player.looseHealth(damage);
        System.out.println("Remaining Health is " + player.healthRemaining());

        damage = 11;
        player.looseHealth(damage);
        System.out.println("Remaining Health is " + player.healthRemaining());*/

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Sreeram",150,"Word");
        System.out.println("Initial Health is "+ enhancedPlayer.getHealth());

        Printer printer = new Printer(50,true);
        System.out.println("Initial Page Count " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed was "+ pagesPrinted + " Total print pages for Printer is " + printer.getPagesPrinted()) ;
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages Printed was "+ pagesPrinted + " Total print pages for Printer is " + printer.getPagesPrinted());
    }
}
