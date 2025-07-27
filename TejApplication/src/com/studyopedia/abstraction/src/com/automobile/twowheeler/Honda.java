package com.automobile.twowheeler;
import com.automobile.vehicle;
public class Honda extends vehicle{
	 public String getModelName() {
	        return "Honda Activa";
	    }

	    public String getRegistrationNumber() {
	        return "TS10CD5678";
	    }

	    public String getOwnerName() {
	        return "Tejaswini";
	    }

	    public int getSpeed() {
	        return 50;
	    }

	    public void cdplayer() {
	        System.out.println("CD Player is now playing.");
	    }

}
