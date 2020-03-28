/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import GUI.*;
import java.sql.*;
import javabean.Receptionist;

public class ReceptionistDAO {
    private final Connection connection;
    private int result;
    
    public ReceptionistDAO(){
        connection =  DBConnection.getConnection();
    }
    public int loginreceptionist(Receptionist user1) {

        try {
            String sql = "Select * from receptionist where receptionist_id=? and receptionist_password=?";

            PreparedStatement myPs = connection.prepareStatement(sql);
            myPs.setString(1, user1.getReceptionistId());
            myPs.setString(2, user1.getReceptionistPassword());

            
            

        } catch (Exception e) {
            System.out.println("Exception is ; " + e);
        }
        return result;
    }
    //public int login(Membership User)
}