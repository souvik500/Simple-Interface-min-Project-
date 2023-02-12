package com.driver;

public interface Telecommunication
{
    void powerON();
    void dial ();
    void answer();
    boolean callingPhone(String phoneNo);
    boolean isRinging();
}
