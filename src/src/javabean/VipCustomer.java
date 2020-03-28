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
public class VipCustomer extends Customer1 {

    private String membershipId;
    private static double discount = 0.85;

    public VipCustomer(String memId, double discount, String customerId, String customerName, String customerAddr, String customerPhone, String customerEmail) {
        super(customerId,customerName, customerAddr, customerPhone, customerEmail);
        setMembershipId(memId);
        setDiscount(discount);
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        VipCustomer.discount = discount;
    }

   
     public String toString(){
        return String.format("%s\nMembership ID :%s\n Discount :%s",super.toString(),getMembershipId(),getDiscount());
}
}
