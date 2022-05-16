package io.github.bluething.playground.tdd.airport.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Given there is an business flight")
@Nested
public class BusinessFlightTest {
    @DisplayName("When we have a usual passenger")
    @Nested
    class UsualPassenger {
        @DisplayName("Then we can't add them to an business flight")
        @Test
        public void addPassengerReturnFalse() {
            Passenger fulan = new Passenger("Fulan", false);
            Flight businessFlight = new BusinessFlight("2");
            Assertions.assertFalse(businessFlight.addPassenger(fulan));
        }
    }

    @DisplayName("When we have a VIP passenger")
    @Nested
    class VIPPassenger {
        @DisplayName("Then we can add them to an business flight")
        @Test
        public void addPassengerReturnTrue() {
            Passenger fulan = new Passenger("Fulan", true);
            Flight businessFlight = new BusinessFlight("2");
            Assertions.assertTrue(businessFlight.addPassenger(fulan));
        }
    }
}
