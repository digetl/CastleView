package Rooms;

import Items.Items;
import Players.Player;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Items> roomContents;
    private ArrayList<Player> roomPlayers;

    public Room(String name, ArrayList<Items> roomContents){
        this.name = name;
        this.roomContents = new ArrayList<Items>();
        this.roomPlayers = new ArrayList<Player>();
    }


    public String getName(){
        return name;
    }

    public int roomContentCount(){
        return roomContents.size();
    }

    public int roomPlayersCount(){
        return roomPlayers.size();
    }

    public void addPlayerToRoom(Player player){
        this.roomPlayers.add(player);
    }

    public void addItemToRoom(Items item){
        this.roomContents.add(item);
    }

    public boolean moveToNewRoom(Player player) {
        if (player.getHealthPoints() == 0) {
            return true;
        }
        return false;
    }
}
