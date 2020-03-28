/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import gui.*;
import java.sql.*;
import javabean.Customer1;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.swing.table.DefaultTableModel;
import gui.CustomerRegistration;
import javax.swing.JOptionPane;

/**
 *
 * @author U S E R
 */
public class CusRegistrationDAO extends CustomerRegistration {

    private final Connection connection;
    private int result;

    public CusRegistrationDAO() {
        connection = DBConnection.getConnection();
    }

    public int addUser(Customer1 user) {
        try {
            String mySqlQuery = "insert into customer "
                    + "(cusid,cusname,cusaddress,cusphoneno,cusemail)"
                    + "values (?,?,?,?,?)";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, user.getCustomerId());
            myPs.setString(2, user.getCustomerName());
            myPs.setString(3, user.getCustomerAddr());
            myPs.setString(4, user.getCustomerPhone());
            myPs.setString(5, user.getCustomerEmail());

            result = myPs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception is ; " + e);
        }
        load_table();
        return result;

    }

    public int updateUser(Customer1 user) {
        try {
            String mySqlQuery = "update customer set cusname=?,cusaddress=?,cusphoneno=?,cusemail=? where cusid=?";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);

            myPs.setString(1, user.getCustomerName());
            myPs.setString(2, user.getCustomerAddr());
            myPs.setString(3, user.getCustomerPhone());
            myPs.setString(4, user.getCustomerEmail());
             myPs.setString(5, user.getCustomerId());
            result = myPs.executeUpdate();
            JOptionPane.showMessageDialog(this, "Update Successful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return result;

    }

    public int deleteUser(String cusid) {
        try {
            String mySqlQuery = "DELETE  from customer where cusid=?";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, cusid);
            result = myPs.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete Successful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return result;
    }

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("CustomerId");
        model.addColumn("CustomerName");
        model.addColumn("CustomerAddress");
        model.addColumn("CustomerPhone");
        model.addColumn("CustomerEmail");


        try {
            int no = 1;
            String sql = "select * from customer";
            PreparedStatement myPs = connection.prepareStatement(sql);
            ResultSet res = myPs.executeQuery();
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10)});

            }

        } catch (Exception e) {

        }
    }

}
