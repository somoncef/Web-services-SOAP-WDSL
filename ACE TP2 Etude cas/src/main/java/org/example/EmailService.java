package org.example;

public class EmailService {
    public String sendEmail(Employer E){
        return " Status : "+E.getStatus() +" Name : "+E.getName();
    }
}
