package com.ps;

public class LeaseContract extends Contract {

    private double expectedEndingValue;

    private double leaseFee;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSelected, int totalPrice, int monthlyPayment, double expectedEndingValue, double leaseFee) {
        super(dateOfContract, customerName, customerEmail, vehicleSelected, totalPrice, monthlyPayment);
        this.expectedEndingValue = vehicleSelected.getPrice()/2;
        this.leaseFee = leaseFee;
        //-> do the calculation... original cost *.07


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
    public String toString() {
        return "LeaseContract{" +
                "expectedEndingValue=" + expectedEndingValue +
                ", leaseFee=" + leaseFee +
                '}';
    }
}