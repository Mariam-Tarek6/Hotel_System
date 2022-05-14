package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Standard extends Room {
    Scanner sc = new Scanner(System.in);
    private int NumOfBeds;

    private static double bedPrice;
    static ArrayList<Room> q = new ArrayList();

    public double getBedPrice() {
        return bedPrice;
    }

    public void setBedPrice(double bedPrice) {
        Standard.bedPrice = bedPrice;
    }

    public Standard() {
        this.sc = new Scanner(System.in);
    }

    public void setNumOfBeds(int numOfBeds) {
        NumOfBeds = numOfBeds;
    }

    public int getNumOfBeds() {
        return NumOfBeds;
    }


    public Standard(int numOfBeds, double roomPrice, int roomNum, int daysOfReservation, boolean isReserved, double bedPrice, String roomType) {
        super(roomNum, daysOfReservation, isReserved, roomPrice, roomType);
        this.sc = new Scanner(System.in);
        NumOfBeds = numOfBeds;
        Standard.bedPrice = bedPrice;
    }

    static Standard s = new Standard();
      public static void reserve(ArrayList<Room> room) {
        int j = 0;
        Scanner sc = new Scanner(System.in);
        //Standard cc = (Standard) s;
        for (int i = 0; i < room.size(); i++) {

            if (room.get(i).getRoomType().equalsIgnoreCase("Standard")) {
                System.out.println("enter room number:");
                room.get(i).setRoomNum(sc.nextInt());
                System.out.println("Enter Days of reservation:");
                room.get(i).setDaysOfReservation(sc.nextInt());
                room.get(i).setIsReserved(true);
                System.out.println("enter number of bed:");
                room.get(i).add2.setNumOfBeds(sc.nextInt());
                room.get(i).setRoomPrice(room.get(i).add2.getBedPrice() * room.get(i).add2.getNumOfBeds() * room.get(i).getDaysOfReservation());
                break;
            }
        }

    }

    public static void TotalPrice(ArrayList<Room> room) {
        double total = 0.0D;
        floor f1 = new floor();
        for (int i = 0; i < room.size(); ++i) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Standard")) {
                total = room.get(i).getRoomPrice() + total;
            }
        }
        System.out.println("total price:" + total);
    }

    public void reservedOrNot(ArrayList<Room> room) {
        //boolean zz = false;


        for (int i = 0; i < room.size(); i++) {

            if (room.get(i).getRoomType().equalsIgnoreCase("Standard")) {
                boolean zz = false;
                //System.out.print("Room num.: "+room.get(i).getRoomNum());
                if ((room.get(i).getIsReserved())) {
                    zz = true;
                }

                if (!(room.get(i).getIsReserved())) {
                    zz = false;
                }
                if (zz) {
                    System.out.print("Room num.: " + room.get(i).getRoomNum());

                    System.out.println("***Room  reserved ****");
                }

                if (!zz) {
                    System.out.print("Room num.: " + room.get(i).getRoomNum());

                    System.out.println("***Room  not reserved ****");
                }
            }
        }
    }

    public void checkOut(ArrayList<Room> room) {
        System.out.println("enter room number :");
        int c = sc.nextInt();

        for (int i = 0; i < room.size(); ++i) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Standard")) {
                if (c == room.get(i).getRoomNum()) {
                    System.out.println(room.get(i).getRoomPrice());
                    room.get(i).setDaysOfReservation(0);
                    room.get(i).setRoomPrice(0);
                    room.get(i).setIsReserved(false);
                    System.out.println("DONE");
                }
            }
        }

    }

    public String toString() {

        return "StandardRoom{" + super.toString() + "NumOfBeds=" + this.getNumOfBeds() + "bed price " + getBedPrice() + " }";
    }

    public void display(ArrayList<Room> room) {
        for (int i = 0; i < room.size(); ++i) {
            if (room.get(i).getRoomType().equalsIgnoreCase("Standard")) {
                System.out.println(room.get(i));
            }
        }
    }
}
