package com.SOLID.NotificationSystem;

public class SMSNotification implements NotificationSender{
    @Override
    public void sendMessage(String Message){
        System.out.println("SMS Notification");
    }
}
