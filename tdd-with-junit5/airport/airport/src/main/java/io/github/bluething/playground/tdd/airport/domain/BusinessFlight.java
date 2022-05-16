package io.github.bluething.playground.tdd.airport.domain;

public class BusinessFlight implements Flight {
    public BusinessFlight(String s) {
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return true;
    }
}
