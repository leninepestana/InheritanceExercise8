package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class TaxProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> tax = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");		
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(Character.toLowerCase(ch) == 'i'){
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				Individual ind = new Individual(name, anualIncome, healthExpenditures);
				tax.add(ind);
			}
			else {
				System.out.print("Number of employees: ");
				int workers = sc.nextInt();
				Company comp = new Company(name, anualIncome, workers);
				tax.add(comp);
			}
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID:");
		
		for(TaxPayer t : tax) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
		}
		
		double sum = 0.0;
		for(TaxPayer t : tax) {
			sum += t.tax();
		}
		
		System.out.println();
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
