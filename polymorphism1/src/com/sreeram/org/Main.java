package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/28/18.
 */
 class Car {
    private String name;
    private int numOfWheels;
    private Boolean engine;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.numOfWheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() engine started !!");
    }

    public void accelerate() {
        System.out.println("Car.accelerate() car is accelerating!!");
    }

    public void brake() {
        System.out.println("Car.brake() car's Brake has been applied!!");
    }


}

class Honda extends Car {

    public Honda() {
        super("Honda", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda.startEngine() engine started !!");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda.accelerate() car is accelerating!!");
    }

    @Override
    public void brake() {
        System.out.println("Honda.brake() car's Brake has been applied!!");
    }
}

class Ford extends Car {
    public Ford() {
        super("Ford", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford.startEngine() engine started !!");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford.accelerate() car is accelerating!!");
    }

    @Override
    public void brake() {
        System.out.println(getClass() + " car's Brake has been applied!!");
    }
}




class Hyundai extends Car {
    public Hyundai() {
        super("Hyundai", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Hyundai.startEngine() engine started !!");
    }

    @Override
    public void accelerate() {
        System.out.println("Hyundai.accelerate() car is accelerating!!");
    }

    @Override
    public void brake() {
        System.out.println("Hyundai.brake() car's Brake has been applied!!");
    }
}



class Toyota extends Car {
    public Toyota() {
        super("Toyota", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota.startEngine() engine started !!");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota.accelerate() car is accelerating!!");
    }

    @Override
    public void brake() {
        System.out.println("Toyota.brake() car's Brake has been applied!!");
    }
}





public class Main {

    public static void main(String[] args) {
	Car myCar = new Car("Swift",6);
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();

	  for (int i=0;i<10;i++) {
          myCar =getCar();
	      myCar.startEngine();
          myCar.accelerate();
          myCar.brake();
      }
       Hamburger hamburger = new Hamburger("Basic","Chicken",3.56,"white");
       double price =hamburger.itemizeHamburger();
       hamburger.addHamburgerAddition1("Tomato",0.37);
       hamburger.addHamburgerAddition2("Lettue",0.75);
       hamburger.addHamburgerAddition3("Cheese",1.12);
        System.out.println("Total Hamburger price is  "+  hamburger.itemizeHamburger());

        HealthBurger healthBurger = new HealthBurger("Chicken",2.99);
        healthBurger.addHealthyAddition1("Egg",5.00);
        healthBurger.addHealthyAddition2("Lentils",3.00);
        System.out.println("The Total Price of Healthy Hamburger is " + healthBurger.itemizeHamburger());

         DeluxeBurger deluxeBurger = new DeluxeBurger();
         deluxeBurger.addHamburgerAddition1("Cheese",2.99);
         deluxeBurger.itemizeHamburger();



    }

	    public static Car getCar() {
            int randomNumber = (int) ((Math.random())*5) +1 ;
            System.out.println("random number is " + randomNumber);

            switch (randomNumber) {
                case 1 : return new Ford();
                case 2 : return new Toyota();
                default: return new Honda();
            }

        }
}
