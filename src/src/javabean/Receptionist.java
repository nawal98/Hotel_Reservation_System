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
public class Receptionist {

    private String receptionistId;
    private String receptionistName;
    private String receptionistPassword;
    private String ManagementType;
    
    public Receptionist(String receptId, String receptName, String receptPassword, String ManagementType){
        setReceptionistId(receptId);
        setReceptionistName(receptName);
        setReceptionistPassword(receptPassword);
        setManagementType(ManagementType);
        
        
        if (getManagementType().equals("A")) {
             System.out.println("Manage Customer");
        } else if (getManagementType().equals("B")) {
            System.out.println("Manage Room ");
        } else if (getManagementType().equals("C")) {
            System.out.println("Manage Booking");
        } else if (getManagementType().equals("D")) {
            System.out.println("Manage Billing");
        }else
            System.out.println("Enter type of management again");   
    }

    public String getManagementType() {
        return ManagementType;
    }

    public void setManagementType(String ManagementType) {
        this.ManagementType = ManagementType;
    }

    public String getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(String receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public String getReceptionistPassword() {
        return receptionistPassword;
    }

    public void setReceptionistPassword(String receptionistPassword) {
        this.receptionistPassword = receptionistPassword;
    }

    public String addCustomer() {
        return this.addCustomer();
    }

    public String editCustomer() {
        return this.editCustomer();
    }

    public String viewCustomer() {
        return this.viewCustomer();
    }

    public String deleteCustomer() {
        return this.deleteCustomer();
    }

    public String updateInfo() {
        return this.updateInfo();
    }

    public String makeBooking() {
        return this.makeBooking();
    }

    public String deleteBooking() {
        return this.deleteBooking();
    }


    public String makeBilling() {
        return this.makeBilling();
    }
    public String toString(){
        return String.format(" Receptionist id :%s\nTeceptionist Name :%s\n Receptionist Password :%s\n",getReceptionistId(),getReceptionistName(),getReceptionistPassword());

    }
}