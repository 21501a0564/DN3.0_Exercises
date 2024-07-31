package com.example.decorator;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String msg) {
        System.out.println("Sending email notification: " + msg);
    }
}
