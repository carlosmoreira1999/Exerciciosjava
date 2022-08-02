package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas?");
		int qtdp = sc.nextInt();
		List<Pessoa> pessoas = new ArrayList<>();
		for(int i=0; i < qtdp; i++) {
			System.out.println("Dados da " + (i+1) + "a Pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			Double altura = sc.nextDouble();
			pessoas.add(new Pessoa(nome, idade, altura));
			}
		System.out.println("");
		System.out.println(Pessoa.calculaMedia(pessoas));
		sc.close();
	}

}
