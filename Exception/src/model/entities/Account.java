package model.entities;

import model.exception.AccountException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrwLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrwLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrwLimit = withdrwLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithdrwLimit() {
		return withdrwLimit;
	}

	public void setWithdrwLimit(Double withdrwLimit) {
		this.withdrwLimit = withdrwLimit;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
		
	}
	
	public void withdraw(double amount) {
		this.balance = balance - amount;
		
		if (amount > balance) {
			throw new AccountException("O saldo é menor que o valor a ser sacado.");
		}
	}
	
	
}
