package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		ArrayList<Product> produtos = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		Scanner sc = new Scanner (System.in);
		int qtd = sc.nextInt();
		sc.nextInt();
		for (int i = 0; i < qtd; i++ ) {
			System.out.print("common, used of imported (c/u/i)? ");
			String imported = sc.nextLine();
			System.out.println("");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("");
			System.out.println("Price: ");
			double price = sc.nextDouble();
			System.out.println("");
			
			
			
			// criar ifs pra definir conta corrente ou poupança usando polimorfismos pra colocar os duas dentro da lista de contas 
			
			
		}
		
	}

}
