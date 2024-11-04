package com.ps;

public class LeaseContract extends Contract {

    private double expectedEndingValue;

    private double leaseFee;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSelected, int totalPrice, int monthlyPayment, double expectedEndingValue, double leaseFee) {
        super(dateOfContract, customerName, customerEmail, vehicleSelected, totalPrice, monthlyPayment);
        this.expectedEndingValue = vehicleSelected.getPrice()/2;
        this.leaseFee = vehicleSelected.getPrice()* 0.07;


    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public float getTotalPrice() {
        // insert formula
        return (float) (getMonthlyPayment()*36+leaseFee);
    }

    @Override
    public float getMonthlyPayment() {
        // insert formula, m=i(1
        double p = expectedEndingValue;
        double i = 0.04/12;
        int n = 36;
        return (float) ((Math.pow(1+i,n)*i)/(Math.pow(1+i,n)-1) * p);

    }

    @Override
    public String toString() {
        return "LeaseContract{" +
                "expectedEndingValue=" + expectedEndingValue +
                ", leaseFee=" + leaseFee +
                '}';
    }
}