package com.bridgelabz.hotelreservationtest;

import com.bridgelabz.hotelreservationtest.HotelReservation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HotelReservationTest {
    HotelReservation hotelreservation = new HotelReservation();

        @Test
        public void checkedGivenHotelNameandRateAreAdded() {
            boolean result = hotelreservation.addHotel("Lakewood", 110, 4);
            Assertions.assertTrue(result);
    }

}
