package com.bridgelabz.hotelreservationtest;

import java.util.ArrayList;

public class HotelReservation {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public boolean addHotel(String hotelName, int rates, int rating) {
        Hotel hotel = new Hotel(hotelName, rates, rating);
        hotelList.add(hotel);
        System.out.println(hotelList.isEmpty());
        if (hotelList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

}
