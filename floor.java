package com.company;

import java.util.ArrayList;

public class floor extends hotel {

    public floor(int floorNum, int roomNum) {
        super(floorNum, roomNum);
    }

    public floor() {

    }
    static ArrayList<String> roomType = new ArrayList<String>();
    ArrayList <Room> rooms=new ArrayList<>();
    public static void rooms(ArrayList<String> lines) {

        int a = 0;
        int j = 0;
        int z = 1;
        ConferenceRoom s2=new ConferenceRoom();
        SweetRoom s1=new SweetRoom();
        Standard s=new Standard();
        ArrayList<Integer> room = new ArrayList<Integer>();
        ArrayList<Room> x1 = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("Floor#")) {
                room.add(j, Integer.parseInt(lines.get(i).substring(14)));
                System.out.println("in the " + z + " floor there are  " + room.get(j) + " rooms");
                j++;
                z++;

            }
            if (lines.get(i).startsWith("Standard")) {

                roomType.add(a, lines.get(i).substring(0, 12));
                System.out.println(roomType.get(a));
                s.setRoomNum(Integer.parseInt((lines.get(i)).substring(9, 12)));
                //a++;
            }
            if (lines.get(i).startsWith("Sweet")) {
                roomType.add(a, lines.get(i));
                System.out.println(roomType.get(a).substring(0, 9));
                a++;
            }
            if (lines.get(i).startsWith("Conference")) {
                roomType.add(a, lines.get(i).substring(0, 14));
                System.out.println(roomType.get(a));
                a++;
            }
        }
    }
}

