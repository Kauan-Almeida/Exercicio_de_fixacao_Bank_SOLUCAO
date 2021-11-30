package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank x;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') { 
			System.out.print("Enter initial deposit value: ");
			double inicialDeposito = sc.nextDouble();
			x = new Bank(number, holder, inicialDeposito);
		}
		else {
			x = new Bank(number, holder);
		}
			
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(x);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		x.deposit(deposito);
		System.out.println("Updated account data: ");
		System.out.println(x);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		x.withdraw(saque);
		System.out.println(x);
		
		
		sc.close();
	}

}
