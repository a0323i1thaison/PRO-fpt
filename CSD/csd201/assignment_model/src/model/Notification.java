package model;

import java.time.LocalDateTime;

public class Notification {

    private String message;
    private LocalDateTime timestamp;
    //private User recipient;
    private boolean isRead;
    
//    public Notification(String message, User recipient) {
//        this.message = message;
//        this.recipient = recipient;
//        this.timestamp = LocalDateTime.now();
//        this.isRead = false;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }
    
    

}