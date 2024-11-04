package com.ps;

public abstract class Contract {
    private String dateOfContract;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSelected;
    private float totalPrice;
    private float monthlyPayment;

    public Contract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSelected) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSelected = vehicleSelected;

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

    public abstract float getTotalPrice();

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public abstract float getMonthlyPayment();

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

