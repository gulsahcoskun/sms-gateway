package com.gulsah;

/**
 * Created by GulsahCoskun on 15.06.2018.
 */
public class OnlineSms implements Sms{


    @Override
    public void sendSms() {
        System.out.println("Sms is sent online");
    }


}
