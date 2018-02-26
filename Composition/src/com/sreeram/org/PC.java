package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/26/18.
 */
public class PC {

    private Case theCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case theCase, MotherBoard motherBoard, Monitor monitor) {
        this.theCase = theCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public void powerUP() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        getMonitor().drawPixelAt(1200,50,"Yellow");
        System.out.println("The Logo has been drawn!!!");
    }
    private Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
