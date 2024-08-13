package com.ofss.main.domain;
import java.sql.Timestamp;
public class BankSlipDetails {
    private int bankSlipId;
    private Timestamp slipDate;
    private String senderBankName;
    private int transactionAmount;
    private String slipStatus;
    private BankAccountDetails bankAccountIdSender;
    private BankAccountDetails bankAccountIdReceiver;
    private BankChequeDetails bankChequeId;
    

    
    // Getters and setters
    public int getBankSlipId() {
        return bankSlipId;
    }
    
    public void setBankSlipId(int bankSlipId) {
        this.bankSlipId = bankSlipId;
    }
    
    public Timestamp getSlipDate() {
        return slipDate;
    }
    
    public void setSlipDate(Timestamp slipDate) {
        this.slipDate = slipDate;
    }
    
    public String getSenderBankName() {
        return senderBankName;
    }
    
    public void setSenderBankName(String senderBankName) {
        this.senderBankName = senderBankName;
    }
    
    public int getTransactionAmount() {
        return transactionAmount;
    }
    
    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    
    public String getSlipStatus() {
        return slipStatus;
    }
    
    public void setSlipStatus(String slipStatus) {
        this.slipStatus = slipStatus;
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
    
    public BankChequeDetails getBankChequeId() {
        return bankChequeId;
    }
    
    public void setBankChequeId(BankChequeDetails bankChequeId) {
        this.bankChequeId = bankChequeId;
    }

        // Constructor
        public BankSlipDetails() {
            // Default constructor
            System.out.println("Default constructor of Slips");
        }
    // Constructor with parameters
    public BankSlipDetails(int bankSlipId, Timestamp slipDate, String senderBankName,
                           int transactionAmount, String slipStatus, BankAccountDetails bankAccountIdSender,
                           BankAccountDetails bankAccountIdReceiver, BankChequeDetails bankChequeId) {
        this.bankSlipId = bankSlipId;
        this.slipDate = slipDate;
        this.senderBankName = senderBankName;
        this.transactionAmount = transactionAmount;
        this.slipStatus = slipStatus;
        this.bankAccountIdSender = bankAccountIdSender;
        this.bankAccountIdReceiver = bankAccountIdReceiver;
        this.bankChequeId = bankChequeId;

        System.out.println("Overridden constructor of BankSlipDetails");
    }

    }


