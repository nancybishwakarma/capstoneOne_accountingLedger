package com.ps;

public class Transaction {

        private String date;
        private String time;
        private String description;
        private String vendor;
        private double amount;


        public Transaction(String date, String time, String description, String vendor, double amount) {
            this.date = date;
            this.time = time;
            this.description = description;
            this.vendor = vendor;
            this.amount = amount;
        }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Transaction | " +
                "Date : '" + date + '\'' +
                ", Time : '" + time + '\'' +
                ", Description : '" + description + '\'' +
                ", Vendor : '" + vendor + '\'' +
                ", Amount : " + amount +
                '}';
    }
}


















