package com.automobile.fourwheeler;
import com.automobile.vehicle;

public class Ford extends vehicle {
    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "KA05MN4567";
    }

    public String getOwnerName() {
        return "Priya";
    }

    public int speed() {
        return 130;
    }

    public void tempControl() {
        System.out.println("Air Conditioning is ON in Ford.");
    }
}