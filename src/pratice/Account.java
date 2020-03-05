package pratice;

public class Account {
	String name;
	int pw;
	int balance;
	
	Account(){
		
	}
	Account(String aName, int aPw, int aBalance){
		name = aName;
		pw = aPw;
		balance = aBalance;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withDraw(int money) {
		balance -= money;
	}
	
	int getBalance() {
		return balance;
	}
}
