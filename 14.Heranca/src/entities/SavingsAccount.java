package entities;

public final class SavingsAccount extends Account{
	//Classe final n�o pode ser herdada por outra classe
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//Sobreposi��o de metodo da superclasse 
	//metodos final n�o podem ser sobrepostos por outras classes
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
