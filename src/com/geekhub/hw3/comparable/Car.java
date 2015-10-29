package com.geekhub.hw3.comparable;

import java.util.Objects;

/**
 * Created by Kvart on 29.10.2015.
 */
public class Car implements Comparable {
    private int maxSpeed;
    public Car(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;

        if (car.maxSpeed > this.maxSpeed) {
            return -1;
        }

        if (car.maxSpeed < this.maxSpeed) {
            return 1;
        }
            return 0;
    }

    @Override
    public String toString() {
        return maxSpeed+"";
    }
}
