package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SweetRoom extends Room {
    private double pricePerNight;
    static ArrayList<Room> b = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public SweetRoom() {
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }


    public SweetRoom(double pricePerNight, int roomNum, int daysOfReservation, boolean isReserved, double roomPrice,String roomType) {
        super(roomNum, daysOfReservation, isReserved, roomPrice,roomType);

        this.pricePerNight = pricePerNight;
    }
    public void reserve(ArrayList <Room>room) {
        int j = 0;
        SweetRoom s = new SweetRoom();
        for (int i = 0; i < room.size();i++) {

            if (room.get(i).getRoomType().equalsIgnoreCase("Sweet")) {
        System.out.println("enter room number:");
        room.get(i).setRoomNum(sc.nextInt());
        System.out.println("Enter Days of reservation:");
        room.get(i).setDaysOfReservation(sc.nextInt());
        room.get(i).setIsReserved(true);
        s.setRoomPrice(room.get(i).add3.getPricePerNight() * room.get(i).getDaysOfReservation());
        System.out.println("The room price is:" + " " + s.getRoomPrice());
            break;
            }

        }
        b.add(j, s);
        j++;
    }

    public void reservedOrNot(ArrayList <Room>room) {
        int hh;
        boolean zz = false;
        for (int i = 0; i < room.size();i++) {

            if (room.get(i).getRoomType().equalsIgnoreCase("Sweet")) {
            System.out.println(room.get(i).getRoomNum());
            if (room.get(i).getIsReserved() ) {
                zz = true;
            }
            if (!(room.get(i).getIsReserved())) {
                zz = false;
            }

            if (zz) {
                System.out.print(room.get(i).getRoomNum());
                System.out.println("***Room  reserved ****");
            }
            if (!zz) {
                System.out.print(room.get(i).getRoomNum());
                System.out.println("***Room  not reserved ****");
            }
        }
        }

    }
    public void TotalPrice(ArrayList <Room>room) {

        double total = 0;
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Sweet")) {
                total = room.get(i).getRoomPrice() + total;
            }
        }
        System.out.println("total price:" + total);
    }

    public void checkOut(ArrayList <Room>room) {
        int c;
        System.out.println("enter room number :");
        c = sc.nextInt();
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Sweet")) {
            if (c == room.get(i).getRoomNum()) {
                System.out.println(room.get(i).getRoomPrice());
                room.get(i).setDaysOfReservation(0);
                room.get(i).setRoomPrice(0);
                room.get(i).setIsReserved(false);
            System.out.println("Done");
            }
            }
        }
    }

    @Override
    public String toString() {
        return "SweetRoom{" + super.toString() +
                "pricePerNight=" + getPricePerNight() +
                '}';
    }

    public void display(ArrayList <Room>room) {
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Sweet")) {
            System.out.println(room.get(i));
        }
        }
    }
}

