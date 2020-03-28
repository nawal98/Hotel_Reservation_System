/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabean;

/**
 * {
 * private double price;
 *
 * public RegularCustomer(double price, String customerName, String
 * customerAddr, String customerPhone, String customerEmail){
 * super(customerName, customerAddr, customerPhone, customerEmail);
 * setPrice(price); }
 *
 * public double getPrice() {
 *
 * @author User
 */
public class RegularCustomer extends Customer1 {

    public RegularCustomer(String customerId, String customerName, String customerAddr, String customerPhone, String customerEmail) {
        super(customerId, customerName, customerAddr, customerPhone, customerEmail);

    }

}
