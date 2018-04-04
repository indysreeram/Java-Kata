package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/25/18.
 */
public class MotherBoard {

    private String name;
    private String manyfacturer;
    private int ramSlots;
    private int cardslots;
    private String bios;

    public MotherBoard(String name, String manyfacturer, int ramSlots, int cardslots, String bios) {
        this.name = name;
        this.manyfacturer = manyfacturer;
        this.ramSlots = ramSlots;
        this.cardslots = cardslots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("The program  " + programName + " was loaded !!!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManyfacturer() {
        return manyfacturer;
    }

    public void setManyfacturer(String manyfacturer) {
        this.manyfacturer = manyfacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardslots() {
        return cardslots;
    }

    public void setCardslots(int cardslots) {
        this.cardslots = cardslots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
