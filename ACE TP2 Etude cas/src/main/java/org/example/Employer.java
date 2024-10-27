package org.example;

public class Employer {
    private String Name;
    private String Status;

    public Employer(String name, String status) {
        Name = name;
        Status = status;
    }

    public String getName() {
        return Name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
