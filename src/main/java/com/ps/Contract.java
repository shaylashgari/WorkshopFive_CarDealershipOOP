package com.ps;

public abstract class Contract {
    private String dateOfContract;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSelected;
    private int totalPrice;
    private int monthlyPayment;

    public Contract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSelected, int totalPrice, int monthlyPayment) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSelected = vehicleSelected;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicleSelected() {
        return vehicleSelected;
    }

    public void setVehicleSelected(Vehicle vehicleSelected) {
        this.vehicleSelected = vehicleSelected;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "dateOfContract='" + dateOfContract + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", vehicleSelected='" + vehicleSelected + '\'' +
                ", totalPrice=" + totalPrice +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}

