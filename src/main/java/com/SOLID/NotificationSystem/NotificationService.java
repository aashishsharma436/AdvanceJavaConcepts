package com.SOLID.NotificationSystem;

public class NotificationService {
    private NotificationSender sender;

    public NotificationService(NotificationSender sender){
        this.sender = sender;
    }

    public void NotifyUser(String Message){
        sender.sendMessage(Message);
    }
}
