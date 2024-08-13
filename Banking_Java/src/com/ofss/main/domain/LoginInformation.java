package com.ofss.main.domain;
import com.ofss.main.domain.BankCustomerDetails;

public class LoginInformation {
    private String username;
    private String password;
    private int attempts;
    private String loginStatus;
    private int bankCustomerId;
    


    public LoginInformation(String username, String password, int attempts, String loginStatus,int bankCustomerId) {
        this.username = username;
        this.password = password;
        this.attempts = attempts;
        this.loginStatus = loginStatus;
        this.bankCustomerId=bankCustomerId;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getAttempts() {
        return attempts;
    }
    
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
    
    public String getLoginStatus() {
        return loginStatus;
    }
    
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }
    public int getBankCustomerId() {
        return bankCustomerId;
    }

    public void setBankCustomerId(int bankCustomerId) {
        this.bankCustomerId = bankCustomerId;
    }

        // Constructor
        public LoginInformation() {
            System.out.println("Default constructor of Login");
        }

        public LoginInformation(int bankCustomerId, String username,String password,int attempts,String loginStatus){
            this.bankCustomerId= bankCustomerId;
            this.username=username;
            this.password=password;
            this.attempts=attempts;
            this.loginStatus=loginStatus;

        }


        @Override
        public String toString() {
            return "Login [Username=" + username + ", password=" + password + ", loginAttempts=" + attempts
                    + ", loginStatus=" + loginStatus + "]";
        }
}

