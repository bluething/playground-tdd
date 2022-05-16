package io.github.bluething.playground.tdd.airport.domain;

public class EconomyFlight implements Flight {
    public EconomyFlight(String s) {
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return false;
    }
}
