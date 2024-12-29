package org.example;

import java.util.ArrayList;

public class Customer {
  private String name, contactInfo, loyaltyPoints, email, phone,Reviews;
  private ArrayList<Booking> bookingHistory;

  public String getReviews() {
    return Reviews;
  }

  public void setReviews(String reviews) {
    Reviews = reviews;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(String contactInfo) {
    this.contactInfo = contactInfo;
  }

  public ArrayList<Booking> getBookingHistory() {
    return bookingHistory;
  }

  public void setBookingHistory(ArrayList<Booking> bookingHistory) {
    this.bookingHistory = bookingHistory;
  }

  public String getLoyaltyPoints() {
    return loyaltyPoints;
  }

  public void setLoyaltyPoints(String loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer(String name, String contactInfo, String loyaltyPoints, String email, String phone, String reviews, ArrayList<Booking> bookingHistory) {
    this.name = name;
    this.contactInfo = contactInfo;
    this.loyaltyPoints = loyaltyPoints;
    this.email = email;
    this.phone = phone;
    Reviews = reviews;
    this.bookingHistory = bookingHistory;
  }
  public void addBooking(Booking booking) {
    this.bookingHistory.add(booking);
  }

  public String viewBookingHistory() {
    String result = "---------------------------------------------------------------\n";
    for (Booking booking : this.bookingHistory) {
      result += "id" + booking.getId() + "\n";
      result += "reception" + booking.getreception() + "\n";
      result += "customer" + booking.getCustomer().name + "\n";
      result += "room" + booking.getRoom().getRoomNumber() + "\n";
      result += "checkInDate" + booking.getCheckInDate() + "\n";
      result += "checkOutDate" + booking.getCheckOutDate() + "\n";
      result += "paymentStatus" + booking.getPaymentStatus() + "\n";
      result+= "---------------------------------------------------------------\n";


    }


return result;
  }
  public void addReview( String review){
    this.setReviews(this.getReviews()+"\n"+review);
  }
}

