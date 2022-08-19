package Lab4;

class Person {
	String name;
	float age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Account {
	long accNum;
	double balance;
	Person accHolder;

	Account() {
	}

	Account(long accNum, double balance, Person accHolder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getBalance() {
		return this.balance;
	}

	void deposit(double balance) {
		this.balance = this.balance + balance;
	}

	void withdraw(double balance) {
		this.balance = this.balance - balance;
	}
}

class SavingsAccount extends Account {
	final double minimumBalance = 500;
	Account a;

	SavingsAccount(Account a) {
		super.accNum = a.accNum;
		super.balance = a.balance;
		super.accHolder = a.accHolder;
	}

	@Override
	void withdraw(double balance) {
		if (super.balance - balance >= this.minimumBalance)
			super.balance = super.balance - balance;
	}
}

class CurrentAccount extends Account {
	double overdraftLimit;

	@Override
	void withdraw(double balance) {
		if (balance <= overdraftLimit) {
			super.balance = super.balance - balance;
			System.out.println(true);
		}
		System.out.println(false);
	}
}

public class Exercise1 {
	public static void main(String args[]) {
		Person a = new Person("smith", 22);
		Person b = new Person("kathy", 23);
		Account a1 = new Account(123, 2000, a);
		Account b1 = new Account(243, 3000, b);
		SavingsAccount k = new SavingsAccount(a1);
		SavingsAccount k1 = new SavingsAccount(b1);
		k.deposit(2000);
		k1.withdraw(2000);
		double x = k.getBalance();
		double y = k1.getBalance();
		System.out.println("Smith's balance is " + x);
		System.out.println("Kathy's balance is " + y);
	}
}
