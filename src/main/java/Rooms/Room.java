package Rooms;

import Items.Items;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Items> roomContents;

    public Room(String name, ArrayList<Items> roomContents){
        this.name = name;
        this.roomContents = new ArrayList<Items>();
    }


    public String getName(){
        return name;
    }


}
