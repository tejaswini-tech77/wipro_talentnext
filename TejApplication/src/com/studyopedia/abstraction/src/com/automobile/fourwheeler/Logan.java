package com.automobile.fourwheeler;
import com.automobile.vehicle;

public class Logan extends vehicle {
    public String getModelName() {
        return "Logan Sedan";
    }

    public String getRegistrationNumber() {
        return "MH12CD9876";
    }

    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 120;
    }

    public void gps() {
        System.out.println("GPS is activated in Logan.");
    }
}
