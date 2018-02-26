package com.sreeram.org;

class Movie{
    private String name;

    public String getName() {
        return name;
    }

    public Movie(String name) {
        this.name = name;

    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A Shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the planet Earth";
    }
}


class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over universe";
    }
}

class ForgetableMovie extends Movie {
    public ForgetableMovie() {
        super("Forgetable Movie");
    }
}

public class Main {

    //This is an example for poylmorphism

    public static void main(String[] args) {
	for (int i =1;i<11;i++){
	    Movie movie = randomMovie();
        System.out.println("Movie # " + i + ": "+ movie.getName() + " plot: "+movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random()* 5)) + 1;
        System.out.println("Our random number is "+ randomNumber);

        switch (randomNumber){
            case 1 :
                return new Jaws();
            case 2 :
                return new IndependenceDay();
            case 3 :
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovie();
            default:
                return null;

        }

    }
}
