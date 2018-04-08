package com.sreeram.org;

/**
 * Created by sreeram.srini on 4/8/18.
 */
public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isOn=false;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("The mobile phone has been powered on");

    }

    @Override
    public void dail(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("The Mobile phone is switched off or the number is different");
        }
    }

    @Override
    public void answer() {
        if(isRinging && isOn){
            System.out.println("Answering the mobile phone");
            isRinging=false;
        } else {
            System.out.println("The Mobile phone is switched off or the number is different");
        }


    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging=true;
            System.out.println("Melody playing");
        } else {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

