package com.wipro.abstractClassesOldPbl;

abstract class GeneralBank
{
	public abstract void getSavingsInterestRate();
	public abstract void getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank
{
	public void getSavingsInterestRate()
	{
		System.out.println("Savings 4%");
	}
	public void getFixedDepositInterestRate()
	{
		System.out.println("Fixed 8.5%");
	}
}
class KotMBank extends GeneralBank
{
	public void getSavingsInterestRate()
	{
		System.out.println("Savings 6%");
	}
	public void getFixedDepositInterestRate()
	{
		System.out.println("Fixed 9%");
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		GeneralBank g=new KotMBank();
		GeneralBank gk=new ICICIBank();
		i.getSavingsInterestRate();
		i.getFixedDepositInterestRate();
		k.getSavingsInterestRate();
		k.getFixedDepositInterestRate();
		g.getSavingsInterestRate();
		g.getFixedDepositInterestRate();
		gk.getSavingsInterestRate();
		gk.getFixedDepositInterestRate();
	}

}
