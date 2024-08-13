package com.ofss.main.domain;
import java.sql.Timestamp;

public class BankFDDetails {
    private int bankFdId;
    private Timestamp fdDate;
    private BankAccountDetails bankAccountId;
    
    // Getters and setters
    public int getBankFdId() {
        return bankFdId;
    }
    
    public void setBankFdId(int bankFdId) {
        this.bankFdId = bankFdId;
    }
    
    public Timestamp getFdDate() {
        return fdDate;
    }
    
    public void setFdDate(Timestamp fdDate) {
        this.fdDate = fdDate;
    }
    
    public BankAccountDetails getBankAccountId() {
        return bankAccountId;
    }
    
    public void setBankAccountId(BankAccountDetails bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

        // Constructor
    public BankFDDetails() {
            // Default constructor
            System.out.println("Default constructor of FD");
        }
        
            // Constructor with parameters
    public BankFDDetails(int bankFdId, Timestamp fdDate, BankAccountDetails bankAccountId) {
        this.bankFdId = bankFdId;
        this.fdDate = fdDate;
        this.bankAccountId = bankAccountId;

        System.out.println("Overridden constructor of BankFdDetails");
    }
}
