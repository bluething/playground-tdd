package io.github.bluething.playground.tdd.airport.domain;

public class Passenger {
    private final String name;
    private final boolean vip;

    public Passenger(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }
}
