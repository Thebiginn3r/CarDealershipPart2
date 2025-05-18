package com.plurasight;

public abstract class Contract {
    private String date;
    private String customerName;
    private String email;
    private int vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, String customerName, String email, int vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.email = email;
        this.vehicleSold = vehicleSold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(int vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    abstract void getTotalPrice();

    abstract void getMonthlyPayment();
}
