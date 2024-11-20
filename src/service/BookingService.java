package service;

import model.Booking;
import model.Room;
import model.User;

import java.time.LocalDate;
import java.util.List;

public class BookingService {

    private List<Room> rooms;
    private List<User> users;

    public void bookRoom(int roomNumber,String userName){
        for (var i:rooms){
            if(i.getRoomNumber()==roomNumber){
                if(i.getStatus().equalsIgnoreCase("available")){
                    i.setStatus("booked");
                    for (var user:users){
                        if(user.getUsername().equals(userName)){
                            user.getBookingHistory().add(new Booking("1",i,user, LocalDate.now(),LocalDate.of(2024,12,12),0));
                        }
                    }
                }
            }
        }
    }


}
