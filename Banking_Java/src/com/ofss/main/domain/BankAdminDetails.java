package com.ofss.main.domain;

public class BankAdminDetails {
    private String adminUsername;
    private String adminPassword;

    public BankAdminDetails(String adminUsername,String adminPassword){
        this.adminUsername=adminUsername;
        this.adminPassword=adminPassword;

    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

}
