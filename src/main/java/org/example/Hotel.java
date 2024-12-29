package org.example;

import java.io.Serializable;
import java.util.ArrayList;

public class Hotel implements Serializable {

    String name;
    String location;
    ArrayList<Room> rooms;
    ArrayList<Staff> staffs;
    ArrayList<Booking> bookings;
    ArrayList<Customer> customers;
    ArrayList<Payment> payments;
    int rating;
    String reviews;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(ArrayList<Staff> staff) {
        this.staffs = staff;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public Hotel(String name, String location, ArrayList<Room> rooms, ArrayList<Staff> staffs, ArrayList<Booking> bookings, ArrayList<Customer> customers, ArrayList<Payment> peyment, int rating, String reviews) {
        this.name = name;
        this.location = location;
        this.rooms = rooms;
        this.staffs = staffs;
        this.bookings = bookings;
        this.customers = customers;
        this.payments = peyment;
        this.rating = rating;
        this.reviews = reviews;
    }
    public void addRoom(Room room){
        this.rooms.add(room);
    }
    public ArrayList<Room> getAvailableRooms(){
        ArrayList<Room> result = new ArrayList<>();
        for (Room room: this.rooms){
            if (room.isAvailable()){
                result.add(room);
            }
        }
        return result;
    }
    //یک کارمند را به لیست کارمندان هتل اضافه می کند
    public void addStaff( Staff staff){
        this.staffs.add(staff);
    }
    public String getHotelInfo(){
        String result = "";
        result+= "name :"+this.name+"\n";
        result+= "location :"+this.location+"\n";
        result+= "rating :"+this.rating+"\n";
        result+= "reviews :"+this.reviews+"\n";
        result+= "rooms :\n";
        for (Room room : rooms){
            result += room.getRoomNumber()+" ";
        }
        for (Staff staff : staffs){
            result += staff.getName()+"/n";
        }
        return result;
    }
    public double  calculateOverallRating(){
        return this.reviews.length()*0.1;

    }
    public void bookRoom(int id, boolean reception, Customer customer, Room room, String checkInDate, String checkOutDate, boolean paymentStatus){
        Booking booking = new Booking(id, reception, customer, room, checkInDate, checkOutDate, paymentStatus);
        this.bookings.add(booking);
    }


}
