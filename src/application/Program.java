package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pCompras, pInadimplencia, pForma;
		
		// Impressão do cabeçalho
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();

		// Leitura do volume e ticket médio
		System.out.print("Quantas compras o cliente fez no último ano? ");
		int vCompras = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		double ticket = sc.nextDouble();
		System.out.println();

		// Leitura dos outros dados
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		int inadimplencia = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		char fPagamento = sc.next().charAt(0);
		System.out.println();
		
		// Score do volume de compras
		if(vCompras == 0) {
			pCompras = 0; 
		}else if(vCompras > 2 && ticket <= 3000.00){
			pCompras = 40; 
		}else if(ticket <= 3000.00){
				pCompras = 20; 	
		}else {
			pCompras = 60;
		}
		
		System.out.println("Score de volume de compras = " + pCompras + " pontos");
		
		
		sc.close();

	}

}
