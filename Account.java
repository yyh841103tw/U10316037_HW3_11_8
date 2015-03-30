import java.util.ArrayList;
import java.util.Date;

public class Account{
		
		// Declare four data fields 
		private int id = 0;
		private double balance = 0;
		private double  annualInterestRate = 0;
		private String name;
		public java.util.Date dateCreated;
		int a = 0;
		
		ArrayList<Transaction> transaction = new ArrayList<Transaction>();
	
	
	//A no-arg constructor to create a default Account
	Account(){
		dateCreated = new java.util.Date();
	}
	//A constructor
	Account(int newId,double newBalance,String newName){
		id = newId;
		balance = newBalance;
		name = newName;
		dateCreated = new java.util.Date();
	}
	// The setter and getter methods for all  data fields
	public void setId(int newId){
		id = newId;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//a method to deposit the money
	public void deposit(double putMoney){
		balance += putMoney;
		transaction.add(new Transaction('D',putMoney,balance,"END"));
		System.out.println((transaction.get(a)).toString());
		a++;
	}
	//a method to withDraw the money
	public void withDraw(double takeMoney){
		balance -= takeMoney; 
		transaction.add(new Transaction('W',takeMoney,balance,"END"));
		System.out.println((transaction.get(i)).toString());
		a++;
	}
	public double getMonthlyInterestRate(){
		return getBalance()*getAnnualInterestRate()/12.0/100;
	}
	//print out the String Detail
	public String toString(){
		return "Your ID is " + getId() +  "\nYour name is " + getName() + "\nThe balance is " + (int)getBalance() + "\nMonthly interest is " + getMonthlyInterestRate()  + "\nThe date you create this account is " + dateCreated;		
	}
	
}
