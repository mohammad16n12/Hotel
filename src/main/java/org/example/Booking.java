package org.example;

import java.util.Scanner;

public class Booking {

    private int id;
    private boolean reception;
    private Customer customer;
    private Room room;
    private String checkInDate;
    private String checkOutDate;
    private boolean paymentStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isReception() {
        return reception;
    }

    public void setReception(boolean reception) {
        this.reception = reception;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }
    public boolean getreception() {
        return reception;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }
    public boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Booking(int id, boolean reception, Customer customer, Room room, String checkInDate, String checkOutDate, boolean paymentStatus) {
        this.id = id;
        this.reception = reception;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.paymentStatus = paymentStatus;
    }
    public static void  calculateTotalCost(){
        System.out.println("how many nights you would like to stay in this hotel?");
        System.out.print("type here: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfNights = scanner.nextInt();
        long pricePerNight = 2000;
        long result = numberOfNights * pricePerNight;
        System.out.println( "the price calculated will be "+ result + '$');

    }
    public  void canselBooking(){
     this.reception=false;
    }
    public String getBookingInfo(){
        String result = "---------------------------------------------------------------\n";
            result += "id" + this.getId() + "\n";
            result += "reception" + this.getreception() + "\n";
            result += "customer" + this.getCustomer().getName() + "\n";
            result += "room" + this.getRoom().getRoomNumber() + "\n";
            result += "checkInDate" + this.getCheckInDate() + "\n";
            result += "checkOutDate" + this.getCheckOutDate() + "\n";
            result += "paymentStatus" + this.getPaymentStatus() + "\n";
            result+= "---------------------------------------------------------------\n";

        return result;

    }

}
