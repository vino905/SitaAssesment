package com.user.info.dto;

public class UserDetails {

    private String user;
    private String workstation;
    private String status;
    private String message;


    public UserDetails() {
    }


    @Override
    public String toString() {
        return "UserDetails{" + "user='" + user + '\'' + ", workstation='" + workstation + '\'' + ", status='" + status + '\'' + ", message='" + message + '\'' + '}';
    }

    public UserDetails(String user, String workstation, String status, String message) {
        this.user = user;
        this.workstation = workstation;
        this.status = status;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

