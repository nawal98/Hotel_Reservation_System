/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabean;

/**
 *
 * @author User
 */
public class Billing {

    private String room_id;
    private double room_price;
    private int days;
    private String billId;
    private double calculatepaymentVip;
    private double calculatepaymentRegular;
    private int typeofCustomer;
    private double payment;
    
    public Billing(String roomId, double roomPrice, int days, String billId) {
        setRoom_id(roomId);
        setRoom_price(roomPrice);
        setDays(days);
        setBillId(billId);
        setCalculatepaymentVip(calculatepaymentVip);
    }

    public Billing(int typeofCustomer) {
        if (typeofCustomer == 1) {
            setPayment(paymentVip());
        } else {
            setPayment(payment());
        }
    }

    public Billing(int days, double room_price) {
        setDays(days);
        setRoom_price(room_price);
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double paymentVip() {
        double price = getDays() * getRoom_price() * 0.85;
        return price;
    }

    public double payment() {
        double price = getDays() * getRoom_price();
        return price;
    }

    public int getTypeofCustomer() {
        return typeofCustomer;
    }

    public void setTypeofCustomer(int typeofCustomer) {
        this.typeofCustomer = typeofCustomer;
    }

    public double getCalculatepaymentVip() {
        return calculatepaymentVip;
    }

    public void setCalculatepaymentVip(double calculatepaymentVip) {
        this.calculatepaymentVip = calculatepaymentVip;
    }

    public double getCalculatepaymentRegular() {
        return calculatepaymentRegular;
    }

    public void setCalculatepaymentRegular(double calculatepaymentRegular) {
        this.calculatepaymentRegular = calculatepaymentRegular;
    }

    public Billing() {

    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public double getRoom_price() {
        return room_price;
    }

    public void setRoom_price(double room_price) {
        this.room_price = room_price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;

    }

    public double calculatepaymentVIP() {
        return (getRoom_price() * getDays() * 0.85);

    }

    public double calculatepaymentRegular() {
        return (getRoom_price() * getDays());

    }

}
