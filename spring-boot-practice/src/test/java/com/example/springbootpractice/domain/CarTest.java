package com.example.springbootpractice.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

class CarTest {

    @Test
    void test() {
        Car car = Car.of("My Car");
        Seat seat = Seat.of(car);
        car.setSeats(List.of(seat));

        System.out.println(car);
    }
}