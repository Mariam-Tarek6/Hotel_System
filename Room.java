package com.company;

import java.util.ArrayList;

public class Room   {
    private  String roomType;
    private int roomNum;
    private int daysOfReservation;
    private boolean isReserved;
    private double roomPrice;
    ConferenceRoom add;
    Standard add2;
    SweetRoom add3;

    public double getRoomPrice() {
        return roomPrice;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Room(int roomNum, int daysOfReservation, boolean isReserved, double roomPrice,String roomType) {
        this.roomNum = roomNum;
        this.daysOfReservation = daysOfReservation;
        this.isReserved = isReserved;
        this.roomPrice = roomPrice;
        this.roomType=roomType;
      //  this.r=r;
    }
    public Room(){}
         public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getDaysOfReservation() {
        return daysOfReservation;
    }

    public void setDaysOfReservation(int daysOfReservation) {
        this.daysOfReservation = daysOfReservation;
    }

    public boolean getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNum=" + roomNum +
                ", daysOfReservation=" + daysOfReservation +
                ", isReserved=" + isReserved +
                ", roomPrice=" + roomPrice +
                '}';
    }
}