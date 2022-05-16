package io.github.bluething.playground.tdd.airport.domain;

import java.util.ArrayList;
import java.util.List;

public class EconomyFlight implements Flight {

    private final String id;
    private final List<Passenger> passengers;

    public EconomyFlight(String id) {
        this.id = id;
        passengers = new ArrayList<>();
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengers.add(passenger);
    }
}
