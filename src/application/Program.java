package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Impressão do cabeçalho
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		
		//Leitura do volume e ticket médio
		System.out.print("Quantas compras o cliente fez no último ano? ");
		int vCompras = sc.nextInt(); 
		System.out.print("Qual o ticket médio? ");
		double ticket = sc.nextDouble();
		
		sc.close();

	}

}
