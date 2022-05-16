package io.github.bluething.playground.tdd.airport.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Given there is an economy flight")
@Nested
public class EconomyFlightTest {
    @DisplayName("When we have a usual passenger")
    @Nested
    class UsualPassenger {
        @DisplayName("Then we can add them to an economy flight")
        @Test
        public void addPassengerReturnTrue() {
            Passenger fulan = new Passenger("Fulan", false);
            Flight economyFlight = new EconomyFlight("1");
            Assertions.assertTrue(economyFlight.addPassenger(fulan));
        }
    }

    @DisplayName("When we have a VIP passenger")
    @Nested
    class VIPPassenger {
        @DisplayName("Then we can add them to an economy flight")
        @Test
        public void addPassengerReturnTrue() {

        }
    }
}
