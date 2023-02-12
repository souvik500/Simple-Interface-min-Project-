package com.driver;

public class MobilePhone implements Telecommunication
{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerON() {
        isPowerOn = true;
        System.out.println("Mobile Phone has a Power ON");
    }

    @Override
    public void dial() {
        System.out.println("Phone Ringing on: " + this.myNumber);
    }

    @Override
    public void answer() {
        if (this.isRinging && isPowerOn) {
            isRinging = false;
            System.out.println("Answering Mobile Phone");
        }
        else System.out.println("Phone is not ringing");
    }

    @Override
    public boolean callingPhone(String phoneNo) {

        if(phoneNo == this.myNumber && isPowerOn)
        {
            isRinging = true;
            System.out.println("Phone is Ringing");
        }
        else{
            isRinging = false;
            System.out.println("Either Wrong Number Dialed or Phone is off");
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
