package com.pluralsight.Week5;

import com.pluralsight.Week5.HotelOperations.Hotel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void getAvailableSuites() {
        // arrange
        Hotel hotel = new Hotel("bla", 50, 50, 25, 30);
        int expectedAvailableSuites = 25;

        // act
        int availableSuites = hotel.getAvailableSuites();

        // assert
        assertEquals(expectedAvailableSuites, availableSuites);
    }

    @Test
    void getAvailableBasicRooms() {
        // arrange

        // act

        // assert
    }

    @Test
    void bookRoom() {
        // arrange

        // act

        // assert
    }

}