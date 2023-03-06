package com.example.springbootpractice.domain;

import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data(staticConstructor = "of")
@ToString
public class Car {
    private final String name;
    private List<Seat>  seats;
}
