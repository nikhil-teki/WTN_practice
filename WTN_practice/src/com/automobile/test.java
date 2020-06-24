package com.automobile;

import com.automobile.twowheeler.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero heroVehicle=new Hero();
		Honda hondaVehicle=new Honda();
		heroVehicle.setModelName("Splendor");
		heroVehicle.setRegistrationNumber("AP07CA1738");
		heroVehicle.setOwnerName("IamTheOwner");
		heroVehicle.setSpeed(80);
		System.out.println("Model : "+heroVehicle.getModelName());
		System.out.println("Reg no. : "+heroVehicle.getRegistrationNumber());
		System.out.println("Owner : "+heroVehicle.getOwnerName());
		System.out.println("Speed : "+heroVehicle.getSpeed()+" kmph");
		heroVehicle.radio();
		hondaVehicle.setModelName("Activa");
		hondaVehicle.setRegistrationNumber("AP07CA1538");
		hondaVehicle.setOwnerName("IamTheOwnerAgain");
		hondaVehicle.setSpeed(85);
		System.out.println("Model : "+hondaVehicle.getModelName());
		System.out.println("Reg no. : "+hondaVehicle.getRegistrationNumber());
		System.out.println("Owner : "+hondaVehicle.getOwnerName());
		System.out.println("Speed : "+hondaVehicle.getSpeed()+" kmph");
		hondaVehicle.cdplayer();
	}

}
