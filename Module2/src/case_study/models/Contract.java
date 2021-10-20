package case_study.models;

import java.util.Collections;

public class Contract {
    private int contractId;
    private int bookingId;
    private double depositMoney;
    private double paymentMoney;
    private int customerId;

    public Contract(){}

    public Contract(int contractId, int bookingId, double depositMoney, double paymentMoney, int customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.depositMoney = depositMoney;
        this.paymentMoney = paymentMoney;
        this.customerId = customerId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
