package org.example;

public class userController {
    public service notificationService;

    public userController(service notificationService) {
        this.notificationService = notificationService;
    }
    void notifyUser(){
        notificationService.execute();
    }
}
