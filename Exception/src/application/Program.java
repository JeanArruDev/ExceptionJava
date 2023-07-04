package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.AccountException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o numero da conta bancaria: ");
		int num = sc.nextInt();
		System.out.println("Digite o nome do titular: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite um valor de deposito inicial: ");
		double balance = sc.nextDouble();
		System.out.println("Digite o Limite de Saque: ");
		double limite = sc.nextDouble();
		
		Account account = new Account(num, holder, balance, limite);
		
		try {
			System.out.println("Insira a quantidade para sacar: ");
			double saque = sc.nextDouble();
			account.withdraw(saque);
			System.out.println("Novo saldo: "+ account.getBalance());
		}
		catch(AccountException e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}
		
		sc.close();
	}

}
