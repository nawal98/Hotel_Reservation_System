/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabean;

/**
 *
 * @author User
 *
 */
public enum RoomManagement {

    R104("Studio", 4, 5, 400.00),
    R103("Deluxe", 3, 3, 300.00),
    R102("Premier", 2, 2, 200.00);

    // private final String room_id;
    private final String room_type;
    private final int room_floor;
    private final int room_capacity;
    private final double room_price;

    RoomManagement(String roomtype, int roomfloor, int roomcapacity, double roomprice) {

        room_type = roomtype;
        room_floor = roomfloor;
        room_capacity = roomcapacity;
        room_price = roomprice;
    }

    /* public String getRoomId(){
        return room_id;
    }
     */
    public String getRoomType() {
        return room_type;
    }

    public int getRoomFloor() {
        return room_floor;
    }

    public int getRoomCapacity() {
        return room_capacity;
    }

    public double getRoomPrice() {
        return room_price;
    }

}
