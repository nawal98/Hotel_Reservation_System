/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author User
 */
import gui.*;
import java.sql.*;
import javabean.bookinggui;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.swing.table.DefaultTableModel;
import gui.Booking;
import javax.swing.JOptionPane;

public class BookingDAO {

    private final Connection connection;
    private int result;

    public BookingDAO() {
        connection = DBConnection.getConnection();
    }

    public int addBooking(bookinggui book) {
        try {
            String mySqlQuery = "insert into booking "
                    + "(bookingid,cusid,checkindate,checkoutdate,roomid)"
                    + "values (?,?,?,?,?)";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, book.getBookingId());
            myPs.setString(2, book.getCustomerId());
            myPs.setString(3, book.getCheckinDate());
            myPs.setString(4, book.getCheckoutDate());
            myPs.setString(5, book.getRoomId());

            result = myPs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception is ; " + e);
        }
        load_table();
        return result;

    }

    public int updateBooking(bookinggui book) {
        try {
            String mySqlQuery = "update booking set cusid=?,checkindate=?,checkoutdate=?,roomid=? where bookingid=?";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);

                 myPs.setString(5, book.getBookingId());
            myPs.setString(1, book.getCustomerId());
            myPs.setString(2, book.getCheckinDate());
            myPs.setString(3, book.getCheckoutDate());
            myPs.setString(4, book.getRoomId());
            result = myPs.executeUpdate();

        } catch (Exception e) {
            System.out.println("Exception is;" + e);
        }
        return result;

    }

    public int deleteBooking(String bookingid) {
        try {
            String mySqlQuery = "DELETE  from booking where bookingid=?";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, bookingid);
            result = myPs.executeUpdate();

        } catch (Exception e) {
            System.out.println("Exception is;" + e);
        }
        return result;
    }

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("BookingId");
        model.addColumn("CustomerId");
        model.addColumn("CheckinDate");
        model.addColumn("CheckoutDate");
        model.addColumn("RoomId");

        try {
            int no = 1;
            String sql = "select * from booking";
            PreparedStatement myPs = connection.prepareStatement(sql);
            ResultSet res = myPs.executeQuery();
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});

            }

        } catch (Exception e) {

        }
    }

}
