package com.ofss.main.domain;
import java.sql.Timestamp;

public class BankTransactionDetails {
    private int bankTransactionId;
    private Timestamp dateOfTransaction;
    private String typeOfTransaction;
    private int transactionAmount;
    private String transactionStatus;
    private BankAccountDetails bankAccountIdSender;
    private BankAccountDetails bankAccountIdReceiver;
    
    // Getters and setters
    public int getBankTransactionId() {
        return bankTransactionId;
    }
    
    public void setBankTransactionId(int bankTransactionId) {
        this.bankTransactionId = bankTransactionId;
    }
    
    public Timestamp getDateOfTransaction() {
        return dateOfTransaction;
    }
    
    public void setDateOfTransaction(Timestamp dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
    
    public String getTypeOfTransaction() {
        return typeOfTransaction;
    }
    
    public void setTypeOfTransaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }
    
    public int getTransactionAmount() {
        return transactionAmount;
    }
    
    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    
    public String getTransactionStatus() {
        return transactionStatus;
    }
    
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    
    public BankAccountDetails getBankAccountIdSender() {
        return bankAccountIdSender;
    }
    
    public void setBankAccountIdSender(BankAccountDetails bankAccountIdSender) {
        this.bankAccountIdSender = bankAccountIdSender;
    }
    
    public BankAccountDetails getBankAccountIdReceiver() {
        return bankAccountIdReceiver;
    }
    
    public void setBankAccountIdReceiver(BankAccountDetails bankAccountIdReceiver) {
        this.bankAccountIdReceiver = bankAccountIdReceiver;
    }

        // Constructor
        public BankTransactionDetails() {
            System.out.println("Default constructor of Transactions");
        }
        
            // Constructor with parameters
    public BankTransactionDetails(int bankTransactionId, Timestamp dateOfTransaction, String typeOfTransaction,
    int transactionAmount, String transactionStatus,
    BankAccountDetails bankAccountIdSender, BankAccountDetails bankAccountIdReceiver) {
this.bankTransactionId = bankTransactionId;
this.dateOfTransaction = dateOfTransaction;
this.typeOfTransaction = typeOfTransaction;
this.transactionAmount = transactionAmount;
this.transactionStatus = transactionStatus;
this.bankAccountIdSender = bankAccountIdSender;
this.bankAccountIdReceiver = bankAccountIdReceiver;

System.out.println("Overridden constructor of BankTransactionDetails");
}
}
