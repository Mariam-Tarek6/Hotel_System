package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ConferenceRoom extends Room {
    private int numOfSeat;
    private double seatsPrice;
    // private double roomPrice;


    static ArrayList<Room> c = new ArrayList<>();
    static ArrayList<Room> f = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ConferenceRoom() {
    }

    public ConferenceRoom(int numOfSeat, double seatPrice, int roomNum, int daysOfReservation, boolean isReserved, double roomPrice, String roomType) {
        super(roomNum, daysOfReservation, isReserved, roomPrice,roomType);
        this.numOfSeat = numOfSeat;
        this.seatsPrice = seatPrice;

    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public double getSeatPrice() {
        return seatsPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatsPrice = seatPrice;
    }

    static ConferenceRoom s = new ConferenceRoom();

    public void reserve(ArrayList <Room>room) {
        int j = 0;
        //ConferenceRoom s = new ConferenceRoom();
        for (int i = 0; i < room.size();i++) {

            if (room.get(i).getRoomType().equalsIgnoreCase("Conference")) {

                System.out.println("enter room number:");
                room.get(i).setRoomNum(sc.nextInt());
                System.out.println("enter number of seat:");
                room.get(i).add.setNumOfSeat(sc.nextInt());

                System.out.println("Enter Days of reservation:");
                room.get(i).setDaysOfReservation(sc.nextInt());
                room.get(i).setIsReserved(true);
                room.get(i).setRoomPrice(room.get(i).add.getSeatPrice());

                room.get(i).setRoomPrice(room.get(i).add.getSeatPrice() * room.get(i).getDaysOfReservation()*room.get(i).add.getNumOfSeat());
                System.out.println("The room price is:" + " " + room.get(i).getRoomPrice());
                break;
            }
        }

        c.add(j, s);
        j++;

    }

    public void reservedOrNot(ArrayList <Room>room) {
        int hh;
        boolean zz = false;

        for (int i = 0; i < room.size(); i++) {
           // System.out.println("Room num.: "+c.get(i).getRoomNum());

            if (room.get(i).getIsReserved() == true) {
                System.out.println("Room num.: "+c.get(i).getRoomNum());

                    zz = true;
                }
                if (room.get(i).getIsReserved() == false) {
                    System.out.println("Room num.: "+c.get(i).getRoomNum());
                    zz = false;
                }


             if (zz) {
            System.out.println("***Room  reserved ****");

             }
             if (!zz) {
            System.out.println("***Room  not reserved ****");
             }

        }
    }

    public void TotalPrice(ArrayList <Room>room) {

        double total = 0;
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Conference")) {
                total = total + room.get(i).getRoomPrice();
            }
        }
        System.out.println("total price:" + total);
    }

    public void checkOut(ArrayList <Room>room) {
        int x;
        System.out.println("enter room number :");
        x = sc.nextInt();
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Conference")) {

                if (x == room.get(i).getRoomNum()) {
                    System.out.println(room.get(i).getRoomPrice());
                room.get(i).setDaysOfReservation(0);
                room.get(i).setRoomPrice(0);
                room.get(i).setIsReserved(false);
                System.out.println("Done");
            }
        }}
    }

    @Override
    public String toString() {
        return "ConferenceRoom{" + super.toString() +
                "numOfSeat=" + numOfSeat +
                ", seatPrice=" + seatsPrice +
                '}';
    }

    public void display(ArrayList <Room>room) {
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Conference")) {

                System.out.println(room.get(i));
            }
        }
    }
}
