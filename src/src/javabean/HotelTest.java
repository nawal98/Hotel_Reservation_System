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
import java.util.Scanner;

public class HotelTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Receptionist ID:");
        String receptId = input.nextLine();
        System.out.println("Receptionist Name:");
        String receptName = input.nextLine();
        System.out.println("Receptionist Password:");
        String receptPass = input.nextLine();
        System.out.println("\t   Management");
        System.out.println("------------------------------------");
        System.out.println(" Enter A = Manage Customer");
        System.out.println(" Enter B = Manage Room");

        System.out.println("------------------------------------");

        String manage = input.next();

        Receptionist s = new Receptionist(receptId, receptName, receptPass, manage);

        if ("A".equals(s.getManagementType())) {

            System.out.println("Choose");
            System.out.println("------------------------------------------------------------------");
            System.out.println("enter 1 = add new customer");
            System.out.println("enter 2 = type of customer");
            System.out.println("------------------------------------------------------------------");
            int option = input.nextInt();
            if (option == 1) {
                System.out.print("Customer information\n");
                String C = input.nextLine();

                System.out.print("Customer ID :");
                String customerId = input.nextLine();
                System.out.print("Customer name :");
                String customerName = input.nextLine();
                System.out.print("Customer address :");
                String customerAddr = input.nextLine();
                System.out.print("Customer phone number :");
                String customerPhone = input.nextLine();
                System.out.print("Customer Email :");
                String customerEmail = input.nextLine();

                Customer1 a = new Customer1(customerId, customerName, customerAddr, customerPhone, customerEmail);
                System.out.println(a.toString());
                System.out.println("New Registration Successful!");
            } else if (option == 2) {
                System.out.println("Type of Customer");
                System.out.println("------------------------------------------------------------------");
                System.out.println("enter 1 = VIP");
                System.out.println("enter 2 = Regular");
                System.out.println("------------------------------------------------------------------");
                int option2 = input.nextInt();

                if (option2 == 1) {

                    System.out.println("Enter booking ID:");
                    String bookingid = input.next();
                    System.out.println("Enter customer ID:");
                    String custid = input.next();
                    System.out.println("Enter date for CHECK IN ");
                    System.out.println("----------------------");
                    System.out.print("Enter month of check in: ");
                    int month = input.nextInt();
                    System.out.print("Enter day of check in: ");
                    int day = input.nextInt();
                    System.out.print("Enter year of check in: ");
                    int year = input.nextInt();
                    System.out.println("Enter date for CHECK OUT ");
                    System.out.println("----------------------");
                    System.out.print("Enter month of check out: ");
                    int month1 = input.nextInt();
                    System.out.print("Enter day of check out: ");
                    int day1 = input.nextInt();
                    System.out.print("Enter year of check out: ");
                    int year1 = input.nextInt();
                    Date checkin = new Date(month, day, year);
                    Date checkout = new Date(month1, day1, year1);

                    Billing b = new Billing();
                    String D = input.nextLine();
                    System.out.println("Membership ID :");
                    String memId = input.nextLine();
                    System.out.println("Discount :");
                    System.out.println("15%");
                    System.out.print("Payment information\n");

                    System.out.println("Bill Id:");
                    String billId = input.nextLine();
                    System.out.println("Room Id (R104, R103, R102):");
                    String room_id = input.nextLine();
                    if ("R104".equals(room_id)) {
                        double room_price = 400.00;
                        System.out.println("Type of room: Studio");
                        System.out.println("Room Price: RM400.00 per night");
                        System.out.println("------------------------------");
                        System.out.println("Days:");
                        int days = input.nextInt();
                        Billing cc = new Billing(days, room_price);
                        System.out.printf("Total of payment: RM%.2f\n", cc.paymentVip());
                    } else if ("R103".equals(room_id)) {
                        double room_price = 300.00;
                        System.out.println("Type of room: Deluxe");
                        System.out.println("Room Price: RM300.00 per night");
                        System.out.println("------------------------------");
                        System.out.println("Days:");
                        int days = input.nextInt();
                        Billing cd = new Billing(days, room_price);
                        System.out.printf("Total of payment: RM%.2f\n", cd.paymentVip());
                    } else if ("R102".equals(room_id)) {
                        double room_price = 200.00;
                        System.out.println("Type of room: Premier");
                        System.out.println("Room Price: RM200.00 per night");
                        System.out.println("------------------------------");
                        System.out.println("Days:");
                        int days = input.nextInt();
                        Billing ce = new Billing(days, room_price);
                        System.out.printf("Total of payment: RM%.2f\n", ce.paymentVip());
                    }
                } else {

                    System.out.println("Enter booking ID:");
                    String bookingid = input.next();
                    System.out.println("Enter customer ID:");
                    String custid = input.next();
                    System.out.println("Enter date for CHECK IN ");
                    System.out.println("----------------------");
                    System.out.print("Enter month of check in: ");
                    int month = input.nextInt();
                    System.out.print("Enter day of check in: ");
                    int day = input.nextInt();
                    System.out.print("Enter year of check in: ");
                    int year = input.nextInt();
                    System.out.println("Enter date for CHECK OUT ");
                    System.out.println("----------------------");
                    System.out.print("Enter month of check out: ");
                    int month1 = input.nextInt();
                    System.out.print("Enter day of check out: ");
                    int day1 = input.nextInt();
                    System.out.print("Enter year of check out: ");
                    int year1 = input.nextInt();
                    Date checkin = new Date(month, day, year);
                    Date checkout = new Date(month1, day1, year1);

                    Billing b = new Billing();
                    System.out.print("Payment information\n");
                    String aroom = input.nextLine();
                    System.out.println("Bill Id:");
                    String billId = input.nextLine();
                    System.out.println("Room Id (R104, R103, R102):");
                    String room_id = input.nextLine();
                    if ("R104".equals(room_id)) {
                        double room_price = 400.00;
                        System.out.println("Type of room: Studio");
                        System.out.println("Room Price: RM400.00 per night");
                        System.out.println("------------------------------");
                        System.out.println("Days:");
                        int days = input.nextInt();
                        Billing cf = new Billing(days, room_price);
                        System.out.printf("Total of payment: RM%.2f\n", cf.payment());
                    } else if ("R103".equals(room_id)) {
                        double room_price = 300.00;
                        System.out.println("Type of room: Deluxe");
                        System.out.println("Room Price: RM300.00 per night");
                        System.out.println("------------------------------");
                        System.out.println("Days:");
                        int days = input.nextInt();
                        Billing cg = new Billing(days, room_price);
                        System.out.printf("Total of payment: RM%.2f\n", cg.payment());
                    } else if ("R102".equals(room_id)) {
                        double room_price = 200.00;
                        System.out.println("Type of room: Premier");
                        System.out.println("Room Price: RM200.00 per night");
                        System.out.println("------------------------------");
                        System.out.println("Days:");
                        int days = input.nextInt();
                        Billing ch = new Billing(days, room_price);
                        System.out.printf("Total of payment: RM%.2f\n", ch.payment());
                    }
                }
            }

        } else if ("B".equals(s.getManagementType())) {
            System.out.println("Room Management\n");
            System.out.println("---------------");
            System.out.println("Room ID\tRoom Type\tFloor\tRoom Capacity\tRoom Price");
            System.out.println("-----------------------------------------------------------------");
            for (RoomManagement rm : RoomManagement.values()) {
                System.out.printf("%-10s%-15s%-10s%-15s%-10s\n", rm, rm.getRoomType(), rm.getRoomFloor(), rm.getRoomCapacity(), rm.getRoomPrice());
            }

        }
    }
}
