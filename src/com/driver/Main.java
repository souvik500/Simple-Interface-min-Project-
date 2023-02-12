package com.driver;

public class Main
{
    public static void main(String[] args)
    {
//        DeskPhone dp = new DeskPhone("44512369852");
//        dp.powerON();
//        dp.callingPhone("98989898");
//        dp.dial();
//        dp.answer();

        MobilePhone mp = new MobilePhone("123456");
        mp.powerON();
        mp.callingPhone("123456");
        mp.answer();

    }
}
