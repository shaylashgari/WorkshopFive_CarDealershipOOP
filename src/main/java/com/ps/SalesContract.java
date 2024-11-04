package com.ps;

public class SalesContract extends Contract{
    private float salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean finance;
    private float monthlyPayment;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSelected, int totalPrice, int monthlyPayment, float salesTaxAmount, double recordingFee, double processingFee, boolean finance, float monthlyPayment1) {
        super(dateOfContract, customerName, customerEmail, vehicleSelected, totalPrice, monthlyPayment);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
        this.monthlyPayment = monthlyPayment1;
    }

    public float getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(float salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public float getMonthlyPayment() {
        // monthly payment method, nested if else statement
        if (finance)

    }

    @Override
    public float getTotalPrice(){
        // nested if else statement producing what the total price would look like for finance or sale


    }
    public void setMonthlyPayment(float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return "SalesContract{" +
                "salesTaxAmount=" + salesTaxAmount +
                ", recordingFee=" + recordingFee +
                ", processingFee=" + processingFee +
                ", finance=" + finance +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}