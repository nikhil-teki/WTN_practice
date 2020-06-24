package com.automobile.twowheeler;

public class Honda extends com.automobile.Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public String getModelName()
	{
		return modelName;
	}
	public String getRegistrationNumber()
	{
		return registrationNumber;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void cdplayer()
	{
		System.out.println("Controlling the cdplayer");
	}
}
