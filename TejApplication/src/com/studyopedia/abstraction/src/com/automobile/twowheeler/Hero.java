package com.automobile.twowheeler;
import com.automobile.vehicle;
public class Hero extends vehicle{
	 public String getModelName() {
	        return "Hero Splendor";
	    }

	    public String getRegistrationNumber() {
	        return "TS09AB1234";
	    }

	    public String getOwnerName() {
	        return "Teja";
	    }

	    public int getSpeed() {
	        return 60;
	    }

	    public void radio() {
	        System.out.println("Radio is now ON.");
	    }
	}



