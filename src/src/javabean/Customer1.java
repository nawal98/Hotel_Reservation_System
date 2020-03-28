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
public class Customer1 {

    private String customerId;    // The Persons Name
    private String customerName;        // The Persons Phone Number
    private String customerAddr;        // The Persons Address
    private String customerPhone;
    private String customerEmail;

    public Customer1(String customerId, String customerName, String customerAddr, String customerPhone, String customerEmail) {
        setCustomerId(customerId);
        setCustomerName(customerName);
        setCustomerAddr(customerAddr);
        setCustomerPhone(customerPhone);
        setCustomerEmail(customerEmail);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddr() {
        return customerAddr;
    }

    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

}
