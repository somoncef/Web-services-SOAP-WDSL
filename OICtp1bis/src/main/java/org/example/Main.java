package org.example;

public class Main {
    public static void main(String[] args) {

        IoCContainer container = new IoCContainer();

        container.registerService(EmailService.class,new EmailService());
        container.registerService(SMSService.class,new SMSService());

        userController userControllerEmail = new userController(container.getService(EmailService.class));
        userControllerEmail.notifyUser();
        userController userControllerS = new userController(container.getService(EmailService.class));
        userControllerS.notifyUser();

    }
}