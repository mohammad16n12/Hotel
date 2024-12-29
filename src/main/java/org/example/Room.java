package org.example;

public class Room {

    private int roomNumber;
    private  String type;
    private double price;
    private int bedCount;
    private boolean isAvailable;
    private String feature;

    public Room(int roomNumber, String type, double price, int bedCount, boolean isAvailable, String feature) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.bedCount = bedCount;
        this.isAvailable = isAvailable;
        this.feature = feature;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
    public boolean checkAvailability(){
        return this.isAvailable;

    }
    public void reserve(){
        this.isAvailable=false;

    }
    public void  release(){
        this.isAvailable=true;
    }
    public void addFeature( String feature){
        this.feature+=", "+feature;

    }
    public String getRoomInfo(){
    String result = "";
    result+="roomnumber :"+this.roomNumber+"\n";
    result+="type :"+this.type+"\n";
    result+="price :"+this.price+"\n";
    result+="bedcount :"+this.bedCount+"\n";
    result+="isAvailable :"+this.isAvailable+"\n";
    result+="feature :"+this.feature+"\n";

        return result;
    }
}
