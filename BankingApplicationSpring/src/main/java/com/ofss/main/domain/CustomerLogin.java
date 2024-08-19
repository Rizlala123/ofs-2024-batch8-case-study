package com.ofss.main.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login_information")
public class CustomerLogin {
    
    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "attempts")
    private int attempts;

    @Column(name = "login_status")
    private String loginStatus;

    @Column(name = "bank_customer_id")
    private int bankCustomerId;
        // Default constructor
        public CustomerLogin() {
        }
    
        // Parameterized constructor
        public CustomerLogin(String username, String password, int attempts, String loginStatus, int bankCustomerId) {
            this.username = username;
            this.password = password;
            this.attempts = attempts;
            this.loginStatus = loginStatus;
            this.bankCustomerId = bankCustomerId;
        }
    
        // Getters and Setters
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
    
        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", attempts=" + attempts +
                    ", loginStatus='" + loginStatus + '\'' +
                    ", bankCustomerId=" + bankCustomerId +
                    '}';
        }
    }
