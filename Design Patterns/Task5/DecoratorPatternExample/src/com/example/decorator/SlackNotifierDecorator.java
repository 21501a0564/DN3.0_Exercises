package com.example.decorator;

public class SlackNotifierDecorator extends NotifierDecorator{
    
    public SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String msg){
        super.send(msg);
        sendSlack(msg);
    }

    private void sendSlack(String msg){
        System.out.println("Sending Slack notification: " + msg);
    }
}
