package com.gulsah;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by GulsahCoskun on 15.06.2018.
 */
public class SmsGateway {

    Queue<Command> commandQueue = new LinkedList<>();

    public SmsGateway(Queue<Command> commandQueue){
        this.commandQueue = commandQueue;
    }

    public void process(){
        for(Command command : commandQueue){
            command.execute();
        }
    }

}
