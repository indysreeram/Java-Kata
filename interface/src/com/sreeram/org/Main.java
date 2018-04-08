package com.sreeram.org;

public class Main {

    public static void main(String[] args) {
        ITelephone sreePhone = new DeskPhone(12345);
        sreePhone.powerOn();
        sreePhone.answer();
        sreePhone.callPhone(12345);
        sreePhone.answer();

        sreePhone = new MobilePhone(4567);
        sreePhone.powerOn();
        sreePhone.answer();
        sreePhone.callPhone(4567);
    }
}
