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
public class Booking {

    private String booking_id;
    private String custid;
    private Date checkinDate;
    private Date checkoutDate;
    private String room_id;
    private final Billing billing;

     public Booking(String bookingid,String cust_id,String room_id, Date checkinDate, Date checkoutDate,String roomId, double roomPrice, int days, String billId) {
      setBooking_id(bookingid);
      setCustid(cust_id);
      setCheckinDate(checkinDate);
      setCheckoutDate(checkoutDate);
      setRoom_id(room_id);
      this.billing=new Billing( roomId,  roomPrice,  days, billId);
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String toString() {
        return String.format("Booking ID :%s\nCustomer ID :%s\nRoom ID :%s\nCheck-in Date :%s\nCheck-out Date :%s\n", getBooking_id(), getCustid(), getRoom_id(), getCheckinDate(), getCheckoutDate());
    }
}
