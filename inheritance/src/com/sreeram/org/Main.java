package com.sreeram.org;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie" , 1,8,2,1,2,4,"Silky Coat");

        dog.eat();
        dog.run(10);
        dog.walk(5);

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(20);
        outlander.accelerate(30);
        outlander.accelerate(-42);


    }
}
