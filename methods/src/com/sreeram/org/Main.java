package com.sreeram.org;

public class Main {

    public static void main(String[] args) {

        int score =1000;
        boolean gameOver =true;
        int levelCompleted=5;
        int bonus =100;

       int finalScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The final Score is " + finalScore);

        displayHighScorePosition("Sreeram",calculateHighScorePosition(1500));
        displayHighScorePosition("Nive",calculateHighScorePosition(900));
        displayHighScorePosition("Rohan",calculateHighScorePosition(400));
        displayHighScorePosition("Pranav",calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName , int highscorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highscorePosition);
    }

    public static int calculateHighScorePosition(int highscorePosition) {
        if(highscorePosition >=1000)
            return 1;
        else if(highscorePosition >=500 && highscorePosition <1000)
            return 2;
        else if (highscorePosition >=100 && highscorePosition <500)
            return 3;
        else return 4;
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore =-1;

        if(gameOver){
            finalScore = score + (levelCompleted * bonus);
            finalScore+=2000;

        }

        return finalScore;

    }
}
