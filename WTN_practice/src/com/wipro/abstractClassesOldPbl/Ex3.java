package com.wipro.abstractClassesOldPbl;

abstract class Instrument
{
	public abstract void play();
}
class Piano extends Instrument
{
	public void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument
{
	public void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument
{
	public void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
}
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] instrumentArray=new Instrument[10];
		for(int i=0;i<10;i++)
		{
			if((i+1)%3==1)
				instrumentArray[i]=new Flute();
			else if((i+1)%3==2)
				instrumentArray[i]=new Piano();
			else
				instrumentArray[i]=new Guitar();
			instrumentArray[i].play();
			if(instrumentArray[i] instanceof Piano)
				System.out.println("At index "+i+" the object is an instance of Piano class");
			else if(instrumentArray[i] instanceof Flute)
				System.out.println("At index "+i+" the object is an instance of Flute class");
			else
				System.out.println("At index "+i+" the object is an instance of Guitar class");
		}
	}

}
