package com.ofss.main.domain;

public class BankRateDetails {
    // Constants for rates
    public int RATE_OF_SAVING;
    public int RATE_OF_OVERDRAFT;



    public int getRATE_OF_SAVING() {
        return RATE_OF_SAVING;
    }
    public void setRATE_OF_SAVING(int rATE_OF_SAVING) {
        RATE_OF_SAVING = rATE_OF_SAVING;
    }
    public int getRATE_OF_OVERDRAFT() {
        return RATE_OF_OVERDRAFT;
    }
    public void setRATE_OF_OVERDRAFT(int rATE_OF_OVERDRAFT) {
        RATE_OF_OVERDRAFT = rATE_OF_OVERDRAFT;
    }

    public BankRateDetails(){
        System.out.println("Default constructor of Rate");
    }
}

