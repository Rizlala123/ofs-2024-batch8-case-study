package com.ofss.main.domain;
import java.sql.Timestamp;

public class BankAccountDetails {
    private int bankAccountId;
    private String accountType;
    private Timestamp openingDate;
    private int minimumBalance;
    private int currentBalance;
    private String bankAccountVerificationStatus;
    private BankCustomerDetails bankCustomerId;
    
    // Getters and setters
    public int getBankAccountId() {
        return bankAccountId;
    }
    
    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    public Timestamp getOpeningDate() {
        return openingDate;
    }
    
    public void setOpeningDate(Timestamp openingDate) {
        this.openingDate = openingDate;
    }
    
    public int getMinimumBalance() {
        return minimumBalance;
    }
    
    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
    public int getCurrentBalance() {
        return currentBalance;
    }
    
    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
    
    public String getBankAccountVerificationStatus() {
        return bankAccountVerificationStatus;
    }
    
    public void setBankAccountVerificationStatus(String bankAccountVerificationStatus) {
        this.bankAccountVerificationStatus = bankAccountVerificationStatus;
    }
    
    public BankCustomerDetails getBankCustomerId() {
        return bankCustomerId;
    }
    
    public void setBankCustomerId(BankCustomerDetails bankCustomerId) {
        this.bankCustomerId = bankCustomerId;
    }
    
    // Constructor
    public BankAccountDetails() {
        System.out.println("Default constructor of Account");
    }

    // Constructor with parameters
    public BankAccountDetails(int bankAccountID, String accountType, Timestamp openingDate,
        int minimumBalance, int currentBalance, String bankAccountVerificationStatus,
        BankCustomerDetails bankCustomerID) {
        this.bankAccountId = bankAccountID;
        this.accountType = accountType;
        this.openingDate = openingDate;
        this.minimumBalance = minimumBalance;
        this.currentBalance = currentBalance;
        this.bankAccountVerificationStatus = bankAccountVerificationStatus;
        this.bankCustomerId = bankCustomerID;

        System.out.println("Overridden constructor of BankAccountDetails");
    }
}
