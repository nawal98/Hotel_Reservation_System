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
public class bookinggui {
     private String bookingId;
    private String customerId;
    private String checkinDate;
    private String checkoutDate;
    private String roomId;
    
    public bookinggui(String bookingid,String cusid,String checkindate,String checkoutdate,String roomid){
        setBookingId(bookingid);
        setCustomerId(cusid);
        setCheckinDate(checkindate);
        setCheckoutDate(checkoutdate);
        setRoomId(roomid);
        
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingid) {
        this.bookingId = bookingid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String cusid) {
        this.customerId = cusid;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkindate) {
        this.checkinDate = checkindate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutdate) {
        this.checkoutDate = checkoutdate;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomid) {
        this.roomId = roomid;
    }
    
}
