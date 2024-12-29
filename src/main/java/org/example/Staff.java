package org.example;

public class Staff {
    private String name;
    private int staffId;
    private String position;

    public Staff(String name, int staffId, String position) {
        this.name = name;
        this.staffId = staffId;
        this.position = position;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getStaffId() {

        return staffId;
    }

    public void setStaffId(int staffId) {

        this.staffId = staffId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void viewStaffDetails(){
        System.out.println("name     : " + this.name);
        System.out.println("position : " + this.position);
        System.out.println("staffId  : " + this.staffId);
    }
}
