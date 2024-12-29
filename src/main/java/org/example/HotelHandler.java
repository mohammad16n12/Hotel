
package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class HotelHandler {

    public void run() {
        new FileHandler().checkFileExistence();
        ArrayList<Hotel> hotels = new FileHandler().readAll();
        Scanner scanner = new Scanner(System.in);
        String choose = "";
        while (true) {
            choose = "";
            System.out.println("                           *** Hotel Booking System ***");
            System.out.println("1.  Add Hotel");
            System.out.println("2.  Add Room");
            System.out.println("3.  Add Staff");
            System.out.println("4.  Add Customer");
            System.out.println("5.  Book a Room");
            System.out.println("6.  Show hotels");
            System.out.println("7.  Show Customer");
            System.out.println("8.  Show Bookings");
            System.out.println("9.  Show Payments");
            System.out.println("10. Remove Hotel");
            System.out.println("11. Remove Room");
            System.out.println("12. Remove Staff");
            System.out.println("13. Remove Customer");
            System.out.println("14. Remove Booking");
            System.out.println("15. Exit");
            System.out.print(" Enter Choose : ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1": {
                    String name, location, reviews = "";
                    System.out.println("enter name: ");
                    name = scanner.nextLine();
                    System.out.println("enter location: ");
                    location = scanner.nextLine();
                    ArrayList<Room> rooms = new ArrayList<>();
                    ArrayList<Staff> staffs = new ArrayList<>();
                    ArrayList<Customer> customers = new ArrayList<>();
                    ArrayList<Booking> bookings = new ArrayList<>();
                    ArrayList<Payment> payments = new ArrayList<>();
                    int rating = 0;
                    Hotel hotel = new Hotel(name, location, rooms, staffs, bookings, customers, payments, rating, reviews);
                    hotels.add(hotel);
                    System.out.println("Press any key to continue...");
                    scanner.nextLine();
                    break;
                }
                //________________________________________ Add Hotel______________________________________
                case "2": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i < hotels.size(); i++) {
                        if (hotels.get(i).name.equals(hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        String type, feature;
                        int roomNumber, bedCount;
                        double price;
                        boolean isAvailable;
                        System.out.println("enter roomNumber : ");
                        roomNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("enter type : ");
                        type = scanner.nextLine();
                        System.out.println("enter price : ");
                        price = Double.parseDouble(scanner.nextLine());
                        System.out.println("enter bedCount : ");
                        bedCount = Integer.parseInt(scanner.nextLine());
                        System.out.println("enter isAvailable (true/false): ");
                        isAvailable = Boolean.parseBoolean(scanner.nextLine());
                        System.out.println("enter feature : ");
                        feature = scanner.nextLine();
                        Room room = new Room(roomNumber, type, price, bedCount, isAvailable, feature);
                        hotels.get(i).rooms.add(room);
                    } else {
                        System.out.println("Hotel name not found ");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.nextLine();
                    break;
                }
                //________________________________________ Add Room______________________________________

                case "3": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i < hotels.size(); i++) {
                        if (hotels.get(i).name.equals(hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        String name, position;
                        int staffId;
                        System.out.println("enter name: ");
                        name = scanner.nextLine();
                        System.out.println("enter staffId: ");
                        staffId = Integer.parseInt(scanner.nextLine());
                        System.out.println("enter position: ");
                        position = scanner.nextLine();
                        Staff staff = new Staff(name, staffId, position);
                        hotels.get(i).staffs.add(staff);
                    } else {
                        System.out.println("Hotel name not found");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.nextLine();
                    break;
                }
                //________________________________________ Add Staff______________________________________

                case "4": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i < hotels.size(); i++) {
                        if (hotels.get(i).name.equals(hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        String name, contactInfo, loyaltyPoints, email, phone, Reviews;
                        ArrayList<Booking> bookingHistory = null;
                        System.out.println("enter name : ");
                        name = scanner.nextLine();
                        System.out.println("enter contactIOnfo : ");
                        contactInfo = scanner.nextLine();
                        System.out.println("enter loyaltyPoints : ");
                        loyaltyPoints = scanner.nextLine();
                        System.out.println("enter email : ");
                        email = scanner.nextLine();
                        System.out.println("enter phone : ");
                        phone = scanner.nextLine();
                        System.out.println("enter Reviews : ");
                        Reviews = scanner.nextLine();
                        Customer customer = new Customer(name, contactInfo, loyaltyPoints, email, phone, Reviews, bookingHistory);
                        hotels.get(i).customers.add(customer);
                    }
                    System.out.println("Press any key to continue...");
                    scanner.nextLine();
                    break;
                }
                //________________________________________ Add Customer______________________________________

                case "5": {
                    System.out.println("enter nameHotel : ");
                    String hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        int roomNumber;
                        System.out.println("enter roomNumber : ");
                        roomNumber = scanner.nextInt();
                        scanner.nextLine();
                        boolean found2 = false;
                        int j;
                        for (j = 0; j <hotels.get(i).rooms.size(); j++) {
                            if (hotels.get(i).rooms.get(j).getRoomNumber() == roomNumber) {
                                found2 = true;
                                break;
                            }
                        }
                        if (found2) {
                            int id;
                            boolean reception,paymentStatus;
                            Customer customer;
                            Room room;
                            String checkInDate,checkOutDate;
                            System.out.println("enter customer name: ");
                            String customerName;
                            customerName = scanner.nextLine();
                            boolean found3 = false;
                            int k;
                            for ( k = 0; k < hotels.get(i).customers.size(); k++) {
                                if(hotels.get(i).customers.get(k).getName() == customerName){
                                    found3 = true;
                                    break;
                                }
                            }
                            if(found3){
                                System.out.println("enter id : ");
                                id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("enter checkInDate : ");
                                checkInDate = scanner.nextLine();
                                System.out.println("enter checkOutDate : ");
                                checkOutDate = scanner.nextLine();
                                System.out.println("enter reception : ");
                                reception = scanner.nextBoolean();
                                System.out.println("enter paymentStatus : ");
                                paymentStatus = scanner.nextBoolean();
                                Booking booking = new Booking(id, reception, hotels.get(i).customers.get(k), hotels.get(i).rooms.get(j), checkInDate, checkOutDate, paymentStatus);
                                hotels.get(i).bookings.add(booking);
                            } else{
                                System.out.println("Customer not found.");
                            }
                        }
                        else {
                            System.out.println("Room not found ");
                        }
                    }
                    else {
                        System.out.println("Hotel not found ");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________  Book a Room______________________________________

                case "6": {
                    for (int i = 0; i <hotels.size() ; i++) {
                        System.out.println(hotels.get(i).getHotelInfo());
                    }
                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________  Show hotels______________________________________

                case "7": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        for (int j = 0; j < hotels.get(i).customers.size(); j++) {
                            System.out.println("name: " + hotels.get(i).customers.get(i).getName());
                            System.out.println("contact info" + hotels.get(i).customers.get(j).getContactInfo());
                            System.out.println();
                        }
                    } else {
                        System.out.println("Hotel name not found ");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________Show Customer______________________________________

                case "8": {
                    System.out.println("enter nameHotel : ");
                    String hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        for (int j = 0; j < hotels.get(i).bookings.size(); j++) {
                            System.out.println(hotels.get(i).bookings.get(j).getBookingInfo());

                        }
                    } else {
                        System.out.println("Hotel name not found ");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________  Show Bookings______________________________________

                case "9": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        for (int j = 0; j < hotels.get(i).payments.size(); j++) {
                            System.out.println(hotels.get(i).payments.get(j).getPaymentInfo());
                        }
                    } else {
                        System.out.println("Hotel name not found ");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________Show Payments______________________________________

                case "10": {
                    System.out.println("enter nameHotel : ");
                    String hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        hotels.remove(i);
                    } else {
                        System.out.println("Hotel name not found ");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________ Remove Hotel______________________________________

                case "11": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("enter roomNumber: ");
                        int roomNumber;
                        roomNumber = scanner.nextInt();
                        scanner.nextLine();
                        int j;
                        for (j = 0; j < hotels.get(i).rooms.size(); j++) {
                            if(hotels.get(i).rooms.get(j).getRoomNumber() == roomNumber){
                                hotels.get(i).rooms.remove(j);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Hotel name not found ");
                    }
                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________ Remove Room______________________________________

                case "12": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("enter staffId: ");
                        int staffId;
                        staffId = scanner.nextInt();
                        scanner.nextLine();
                        int j;
                        for (j = 0; j < hotels.get(i).staffs.size(); j++) {
                            if(hotels.get(i).staffs.get(j).getStaffId() == staffId){
                                hotels.get(i).staffs.remove(j);
                                break;
                            }

                        }
                    } else {
                        System.out.println("Hotel name not found ");
                    }

                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________ Remove Staff______________________________________

                case "13": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("enter customerName: ");
                        String customerName;
                        customerName = scanner.nextLine();
                        int j;
                        for (j = 0; j < hotels.get(i).customers.size(); j++) {
                            if(hotels.get(i).customers.get(j).getName() == customerName){
                                hotels.get(i).customers.remove(j);
                                break;
                            }

                        }
                    } else {
                        System.out.println("Hotel name not found ");
                    }

                    System.out.println("Press any key to continue...");
                    scanner.next();
                    break;
                }
                //________________________________________Remove Customer______________________________________

                case "14": {
                    String hotelName;
                    System.out.println("enter nameHotel : ");
                    hotelName = scanner.nextLine();
                    boolean found = false;
                    int i;
                    for (i = 0; i <hotels.size(); i++) {
                        if (Objects.equals(hotels.get(i).name, hotelName)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("enter bookingId: ");
                        int bookingId;
                        bookingId = scanner.nextInt();
                        scanner.nextLine();
                        int j;
                        for (j = 0; j < hotels.get(i).bookings.size(); j++) {
                            if(hotels.get(i).bookings.get(j).getId() == bookingId){
                                hotels.get(i).bookings.remove(j);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Press any key to continue...");
                    }
                    scanner.next();
                    break;
                }
                //________________________________________ Remove Booking______________________________________

                case "15": {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    new FileHandler().saveAll(hotels);
                    return;
                }
                default: {
                    System.out.println("choose is not valid!");
                    System.out.println("Press any key to continue...");
                    scanner.nextLine();
                }
                //________________________________________ Exit______________________________________

            }
        }
    }

    public static void main(String[] args) {
        new HotelHandler().run();
    }
}
