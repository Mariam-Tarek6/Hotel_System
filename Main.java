package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        File files = new File("files/file1");
        Scanner c = new Scanner(System.in);
        Scanner sc = new Scanner(files);
        ArrayList<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        ArrayList<floor> floors=new ArrayList<>();

        floor f=new floor();
        for (int i = 0; i < lines.size(); i++) {


            if (lines.get(i).startsWith("#floor:")) {

                 f.floorNum = Integer.parseInt(lines.get(i).substring(7));
                System.out.println("There are " + f.floorNum + " floors in te hotel ");
                break;
            }
        }

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("Standard")) {
                Standard s3=new Standard();
                s3.add2=new Standard();
                s3.setRoomType( lines.get(i).substring(0, 8));
                s3.setRoomNum(Integer.parseInt((lines.get(i)).substring(9, 12)));
                s3.setNumOfBeds(Integer.parseInt((lines.get(i)).substring(13, 14)));
                s3.add2.setBedPrice(Integer.parseInt((lines.get(i)).substring(15, 17)));
                s3.setDaysOfReservation(0);
                s3.setIsReserved(false);
                f.rooms.add(s3);
            }
            if (lines.get(i).startsWith("Sweet")) {
                SweetRoom s1=new SweetRoom();
                s1.add3=new SweetRoom();
                s1.add3.setPricePerNight(Integer.parseInt(lines.get(i).substring(10, 13)));
                s1.setRoomType(lines.get(i).substring(0, 5));
                s1.setRoomNum(Integer.parseInt(lines.get(i).substring(6,9)));
                //s1.setRoomPrice();
                s1.setDaysOfReservation(0);
                s1.setIsReserved(false);
                f.rooms.add(s1);
            }
            if (lines.get(i).startsWith("Conference")) {
                ConferenceRoom s2=new ConferenceRoom();
                s2.add=new ConferenceRoom();
                s2.setRoomType( lines.get(i).substring(0, 10));
                s2.setRoomNum(Integer.parseInt(lines.get(i).substring(11, 14)));
                s2.add.setSeatPrice(Integer.parseInt(lines.get(i).substring(15, 17)));//SEAT PRICE
              //  s2.setSeatPrice(Integer.parseInt(lines.get(i).substring(18, 19)));
                s2.add.setNumOfSeat(Integer.parseInt(lines.get(i).substring(15, 17)));
                s2.setDaysOfReservation(0);
                s2.setIsReserved(false);
                f.rooms.add(s2);
            }
        }

        floors.add(f);

        for (int i=0;i<f.rooms.size();i++){
                System.out.println(f.rooms.get(i));
        }

        do {
            int a;
            System.out.println("1- To book a room");
            System.out.println("2- To checkout");
            System.out.println("3-To find out the profit");
            System.out.println("4-To find out whether the room is booked or not");
            System.out.println("5-To display details");
            System.out.print("6- EXIT");
            System.out.print("     Select Your Option (1-6): ");
            a = c.nextInt();
            if (a == 1) {
                System.out.println("1- STANDARD ROOM");
                System.out.println("2-SWEET ROOM");
                System.out.println("3-CONFERENCE ROOM");

                System.out.println(" Select Your Option (1-3):");
                int t;
                t = c.nextInt();
                if (t == 1) {
                    Standard s = new Standard();
                  //  s.availableRoom(lines);
                    s.reserve(f.rooms);
                }
                if (t == 2) {
                    SweetRoom s = new SweetRoom();
                    //s.sweetRoom(lines);
                    s.reserve(f.rooms);
                }
                if (t == 3) {
                    ConferenceRoom s = new ConferenceRoom();
                    //s.conferenceRoom(lines);
                    s.reserve(f.rooms);
                }

            }
            if (a == 2) {
                System.out.println("1- STANDARD ROOM");
                System.out.println("2-SWEET ROOM");
                System.out.println("3-CONFERENCE ROOM");

                System.out.println(" Select Your Option (1-3):");
                a = c.nextInt();
                if (a == 1) {
                    Standard s = new Standard();

                    s.checkOut(f.rooms);
                }
                if (a == 2) {
                    SweetRoom s = new SweetRoom();

                    s.checkOut(f.rooms);
                }
                if (a == 3) {
                    ConferenceRoom s = new ConferenceRoom();

                    s.checkOut(f.rooms);
                }
            }
            if (a == 3) {
                System.out.println("1- STANDARD ROOM");
                System.out.println("2-SWEET ROOM");
                System.out.println("3-CONFERENCE ROOM");

                System.out.println(" Select Your Option (1-3):");
                a = c.nextInt();
                if (a == 1) {
                    Room s = new Standard();
                    Standard cc = (Standard) s;
                    cc.TotalPrice(f.rooms);
                }
                if (a == 2) {
                    SweetRoom s = new SweetRoom();

                    s.TotalPrice(f.rooms);
                }
                if (a == 3) {
                    ConferenceRoom s = new ConferenceRoom();

                    s.TotalPrice(f.rooms);
                }
            }
            if (a == 4) {
                System.out.println("1- STANDARD ROOM");
                System.out.println("2-SWEET ROOM");
                System.out.println("3-CONFERENCE ROOM");

                System.out.println(" Select Your Option (1-3):");
                a = c.nextInt();
                if (a == 1) {
                    Standard s = new Standard();

                    s.reservedOrNot(f.rooms);
                }
                if (a == 2) {
                    SweetRoom s = new SweetRoom();

                    s.reservedOrNot(f.rooms);
                }
                if (a == 3) {
                    ConferenceRoom s = new ConferenceRoom();

                    s.reservedOrNot(f.rooms);
                }
            }
            if (a == 5) {
                System.out.println("1- STANDARD ROOM");
                System.out.println("2-SWEET ROOM");
                System.out.println("3-CONFERENCE ROOM");
                System.out.println(" Select Your Option (1-3):");
                a = c.nextInt();
                if (a == 1) {
                    Room s = new Standard();
                    Standard x = (Standard) s;
                    x.display(f.rooms);
                }
                if (a == 2) {
                    Room x = new SweetRoom();
                    SweetRoom s = (SweetRoom) x;
                    s.display(f.rooms);
                }
                if (a == 3) {
                    Room s = new ConferenceRoom();

                    ((ConferenceRoom) s).display(f.rooms);

                }
            }
            if (a == 6) {

                break;
            }
        } while (true);


    }



}



