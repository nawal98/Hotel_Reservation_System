package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
import gui.*;
import java.sql.*;
import javabean.ManageRoomgui;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.swing.table.DefaultTableModel;
import gui.ManageHotelRoom;
import javax.swing.JOptionPane;

/**
 *
 * @author U S E R
 */
public class ManageRoomDAO extends ManageHotelRoom {

    private final Connection connection;
    private int result;

    public ManageRoomDAO() {
        connection = DBConnection.getConnection();
    }

    public int addRoom(ManageRoomgui room) {
        try {
            String mySqlQuery = "insert into manageroom "
                    + "(roomid,roomtype,roomfloor,roomcapacity,roomprice)"
                    + "values (?,?,?,?,?)";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, room.getRoomid());
            myPs.setString(2, room.getRoomtype());
            myPs.setString(3, room.getRoomfloor());
            myPs.setString(4, room.getRoomcapacity());
            myPs.setString(5, room.getRoomprice());

            result = myPs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception is ; " + e);
        }
        load_table();
        return result;

    }

    public int updateRoom(ManageRoomgui room) {
        try {
            String mySqlQuery = "update manageroom set roomtype=?,roomfloor=?,roomcapacity=?,roomprice=? where roomid=? ";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, room.getRoomtype());
            myPs.setString(2, room.getRoomfloor());
            myPs.setString(3, room.getRoomcapacity());
            myPs.setString(4, room.getRoomprice());
            myPs.setString(5, room.getRoomid());

            result = myPs.executeUpdate();
            JOptionPane.showMessageDialog(this, "Update Successful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return result;

    }

    public int deleteRoom(String roomtype) {
        try {
            String mySqlQuery = "DELETE  from manageroom where roomid=?";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, roomtype);
            result = myPs.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete Successful");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return result;
    }

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Roomid");
        model.addColumn("Roomtype");
        model.addColumn("Roomfloor");
        model.addColumn("Roomcapacity");
        model.addColumn("Roomprice");

        try {
            int no = 1;
            String sql = "select * from manageroom";
            PreparedStatement myPs = connection.prepareStatement(sql);
            ResultSet res = myPs.executeQuery();
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4)});

            }

        } catch (Exception e) {

        }
    }

}
