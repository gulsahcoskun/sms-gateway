package com.gulsah;

/**
 * Created by GulsahCoskun on 15.06.2018.
 */
public class SendSmsCommand implements Command {

    private Sms sms;

    public SendSmsCommand(Sms sms){
        this.sms = sms;
    }


    @Override
    public void execute() {
        sms.sendSms();
    }


}
