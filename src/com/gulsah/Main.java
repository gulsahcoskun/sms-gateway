package com.gulsah;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Sms mobileSmsChannel = new MobileSms();
        Sms onlineSmsChannel = new OnlineSms();

        SendSmsCommand mobileCommand = new SendSmsCommand(mobileSmsChannel);
        SendSmsCommand onlineCommand = new SendSmsCommand(onlineSmsChannel);
        SendSmsCommand onlineCommand2 = new SendSmsCommand(onlineSmsChannel);
        SendSmsCommand mobileCommand2 = new SendSmsCommand(mobileSmsChannel);


        Queue<Command> commandQueue = new LinkedList<>();
        commandQueue.add(mobileCommand);
        commandQueue.add(onlineCommand);
        commandQueue.add(onlineCommand2);
        commandQueue.add(mobileCommand2);


        SmsGateway smsGateway = new SmsGateway(commandQueue);
        smsGateway.process();
    }
}
