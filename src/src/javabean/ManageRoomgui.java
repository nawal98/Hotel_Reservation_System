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
public class ManageRoomgui {

    private String roomid;
    private String roomtype;
    private String roomfloor;
    private String roomcapacity;
    private String roomprice;

    public ManageRoomgui(String roomid, String roomtype, String roomfloor, String roomcapacity, String roomprice) {
        setRoomid(roomid);
        setRoomtype(roomtype);
        setRoomfloor(roomfloor);
        setRoomcapacity(roomcapacity);
        setRoomprice(roomprice);
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getRoomfloor() {
        return roomfloor;
    }

    public void setRoomfloor(String roomfloor) {
        this.roomfloor = roomfloor;
    }

    public String getRoomcapacity() {
        return roomcapacity;
    }

    public void setRoomcapacity(String roomcapacity) {
        this.roomcapacity = roomcapacity;
    }

    public String getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(String roomprice) {
        this.roomprice = roomprice;
    }
}
