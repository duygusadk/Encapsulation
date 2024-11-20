package model;

import java.time.LocalDate;
import java.util.UUID;

public class Booking {
    private String reservationId;
    private Room room;
    private  User user;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double totalCost;

    public Booking(String reservationId, Room room, User user, LocalDate checkIn, LocalDate checkOut, double totalCost) {
        this.reservationId = reservationId;
        this.room = room;
        this.user = user;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.totalCost = totalCost;
    }
}
