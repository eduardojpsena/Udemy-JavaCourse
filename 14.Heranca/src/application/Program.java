package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		SavingsAccount sacc = new SavingsAccount(1003, "Jose", 200.0, 0.01);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1004, "Carla", 200.0, 1000.0);
		Account acc3 = sacc;
		Account acc4 = new SavingsAccount(1005, "Andre", 0.0, 0.01);
		
		// DOWNCASTING
		BusinessAccount bacc1 = (BusinessAccount) acc2;
		bacc1.loan(100.0);
		
		//verificar com instanceof se o objeto é do mesmo tipo que se quer converter com o downcasting
		if (acc3 instanceof BusinessAccount) {
			System.out.println("Objetos do mesmo tipo - Business");
			BusinessAccount bacc2 = (BusinessAccount) acc3;
			System.out.println("Loan");
			bacc2.loan(300.0);
		}
		
		if (acc3 instanceof SavingsAccount) {
			System.out.println("Objetos do mesmo tipo - Savings");
			SavingsAccount sacc1 = (SavingsAccount) acc3;
			System.out.println("Update ");
			sacc1.updateBalance();
		}
		
		//Testando Sobreposição de metodo (Override)
		System.out.println("Teste de sobreposição");
		
		Account acct = new Account(5000, "Edvan", 1000.0);
		acct.withdraw(200.0);
		System.out.println("Account balance: R$ " + acct.getBalance());
		
		Account acct2 = new SavingsAccount(6000, "Eduardo", 1000.0, 0.01);
		acct2.withdraw(200.0);
		System.out.println("Saving Account balance: R$ " + acct2.getBalance());
		
		Account acct3 = new BusinessAccount(7000, "Carol", 1000.0, 500.0);
		acct3.withdraw(200.0);
		System.out.println("Business Account balance: R$ " + acct3.getBalance());
	}

}
