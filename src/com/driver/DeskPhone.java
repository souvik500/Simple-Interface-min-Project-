package com.driver;

public class DeskPhone implements Telecommunication
{
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerON() {
        System.out.println("LandPhone always have a Power ON");
    }

    @Override
    public void dial() {
        System.out.println("Phone Ringing on: " + this.myNumber);
    }

    @Override
    public void answer() {
        if (this.isRinging) System.out.println("Answering Land Phone");
        else System.out.println("Phone is not ringing");
    }

    @Override
    public boolean callingPhone(String phoneNo) {

        if(phoneNo == this.myNumber)
        {
            isRinging = true;
            System.out.println("Phone is Ringing");
        }
        else{
            isRinging = false;
            System.out.println("Wrong Number Dialed");
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
