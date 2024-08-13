package com.ofss.main.domain;
import java.sql.Timestamp;

public class BankChequeDetails {
    private int bankChequeId;
    private Timestamp chequeDate;
    private String chequeStatus;
    private BankAccountDetails bankAccountIdSender;
    private BankAccountDetails bankAccountIdReceiver;
    private BankTransactionDetails bankTransactionId;
    
    // Getters and setters
    public int getBankChequeId() {
        return bankChequeId;
    }
    
    public void setBankChequeId(int bankChequeId) {
        this.bankChequeId = bankChequeId;
    }
    
    public Timestamp getChequeDate() {
        return chequeDate;
    }
    
    public void setChequeDate(Timestamp chequeDate) {
        this.chequeDate = chequeDate;
    }
    
    public String getChequeStatus() {
        return chequeStatus;
    }
    
    public void setChequeStatus(String chequeStatus) {
        this.chequeStatus = chequeStatus;
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
    
    public BankTransactionDetails getBankTransactionId() {
        return bankTransactionId;
    }
    
    public void setBankTransactionId(BankTransactionDetails bankTransactionId) {
        this.bankTransactionId = bankTransactionId;
    }

        // Constructor
        public BankChequeDetails() {
            // Default constructor
            System.out.println("Default constructor of Cheque");
        }
        public BankChequeDetails(int bankChequeId, Timestamp chequeDate, String chequeStatus,
                             BankAccountDetails bankAccountIdSender, BankAccountDetails bankAccountIdReceiver, BankTransactionDetails bankTransactionId) {
        this.bankChequeId = bankChequeId;
        this.chequeDate = chequeDate;
        this.chequeStatus = chequeStatus;
        this.bankAccountIdSender = bankAccountIdSender;
        this.bankAccountIdReceiver = bankAccountIdReceiver;
        this.bankTransactionId = bankTransactionId;

        System.out.println("Overridden constructor of BankChequeDetails");
    }
}

