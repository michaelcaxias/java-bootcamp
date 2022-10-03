package br.com.dh.spring03.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle implements Comparable<Vehicle> {
    private String board;
    private String model;
    private int year;
    private double price;

    @Override
    public int compareTo(Vehicle other) {
        if (this.getPrice() == other.getPrice()) {
            return 0;
        }
        if (this.getPrice() < other.getPrice()) {
            return -1;
        }
        return 1;
    }
}
