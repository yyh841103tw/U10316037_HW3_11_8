import java.util.Date;
public class Transaction{
	// Declare  data fields
	public java.util.Date dateCreated;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//A no-arg constructor to create a default Transaction
	Transaction(){
		dateCreated = new java.util.Date();
	}
	//A constructor 
	Transaction(char newType,double newAmount,double newBalance,String newDescription){
		type = newType;
		amount = newAmount;
		balance = newBalance;
		description = newDescription;
		dateCreated = new java.util.Date();
	}
	// The setter and getter methods for all  data fields
	void setType(char newType){
		type = newType;
	}
	char getType(){
		return type;
	}
	void setAmount(double newAmount){
		amount = newAmount;
	}
	double getAmount(){
		return amount;
	}
	void setBalance(double newBalance){
		balance = newBalance;
	}
	double getBalance(){
		return balance;
	}

	void setDescription(String newDescription){
		description = newDescription;
	}
	String getDescription(){
		return description;
	}
	public String toString(){
		return  getType()+ "\t" +getAmount()+ "\t  " +getBalance() + " \t " + dateCreated + "\t" + getDescription();
	}
}
