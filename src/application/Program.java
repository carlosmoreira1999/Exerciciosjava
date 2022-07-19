package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		ArrayList<Product> produtos = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		Scanner sc = new Scanner (System.in);
		int qtd = sc.nextInt();
		sc.nextLine();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		for (int i = 0; i < qtd; i++ ) {
			System.out.println("Product #"+ (i+1) + " data:");
			System.out.print("common, used of imported (c/u/i)? ");
			String type = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			
			if(type.equals("i")) {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				produtos.add(new ImportedProduct(name, price, customsFee));
			}
			sc.nextLine();
			if(type.equals("u")) {
				System.out.print("Manufacture date: ");
				Date manufatureDate = sdf1.parse(sc.nextLine());
				produtos.add(new UsedProduct(name, price, manufatureDate));
			}
			
			if(type.equals("c")) {
			produtos.add(new Product(name, price));
			}
		}
		
		System.out.println("");
		System.out.println("PRICE TAGS:");
		for( Product p : produtos) {
			System.out.println(p.toString());   
		}
		
		
		sc.close();
	}

}
