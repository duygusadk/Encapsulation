package service;

import model.Room;
import model.RoomType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RoomService {

    private List<Room>rooms;


    public List<Room> checkAvailableRooms(String roomType, LocalDate checkIn, LocalDate checkOut){

        List<Room> availableRooms = new ArrayList<>();

        for(var i:rooms){
            if(i.getType().equalsIgnoreCase(roomType)&& i.getStatus().equalsIgnoreCase("available")){
                availableRooms.add(i);
            }
        }

        return availableRooms;
    }

   /* public void updateStatus(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setStatus("booked");

            }
        }
    }*/






}
