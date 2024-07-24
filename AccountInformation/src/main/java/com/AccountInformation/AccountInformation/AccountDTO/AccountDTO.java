package com.AccountInformation.AccountInformation.AccountDTO;

public class AccountDTO {

    private String Name;
    private String Industry;
    private double revenue;
    private String AccountManager;

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public String getAccountManager() {
        return AccountManager;
    }

    public void setAccountManager(String accountManager) {
        AccountManager = accountManager;
    }


}
