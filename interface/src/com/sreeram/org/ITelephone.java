package com.sreeram.org;

/**
 * Created by sreeram.srini on 4/8/18.
 */
public interface ITelephone {
    void powerOn();
    void dail(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
