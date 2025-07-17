package com.SOLID.NotificationSystem;

public class WhatsAppNotification implements NotificationSender{
    @Override
    public void sendMessage(String Message){
        System.out.println("WhatsApp Notification");
    }
}


