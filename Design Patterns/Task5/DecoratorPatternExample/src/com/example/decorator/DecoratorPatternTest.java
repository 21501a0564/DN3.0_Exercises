package com.example.decorator;

public class DecoratorPatternTest {
    public static void main(String[] args){

        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello via Email");


        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send("Hello via Email and SMS");


        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        slackNotifier.send("Hello via Email, SMS, and Slack");
    }
}
