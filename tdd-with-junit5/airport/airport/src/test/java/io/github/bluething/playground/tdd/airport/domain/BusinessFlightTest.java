package io.github.bluething.playground.tdd.airport.domain;

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
        }
    }
}
