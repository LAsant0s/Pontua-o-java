package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Impress�o do cabe�alho
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println();
		
		//Leitura do volume e ticket m�dio
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		int vCompras = sc.nextInt(); 
		System.out.print("Qual o ticket m�dio? ");
		double ticket = sc.nextDouble();
		
		sc.close();

	}

}
