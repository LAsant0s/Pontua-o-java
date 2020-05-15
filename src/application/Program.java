package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int pCompras, pInadimplencia = 0, pForma = 0;
		String classificacao;

		// Impress�o do cabe�alho
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println();

		// Leitura do volume e ticket m�dio
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		int vCompras = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		double ticket = sc.nextDouble();
		System.out.println();

		// Leitura dos outros dados
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		int atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		char fPagamento = sc.next().charAt(0);
		System.out.println();

		// Score do volume de compras
		if (vCompras == 0) {
			pCompras = 0;
		} else if (vCompras > 2 && ticket <= 3000.00) {
			pCompras = 40;
		} else if (ticket <= 3000.00) {
			pCompras = 20;
		} else {
			pCompras = 60;
		}

		System.out.println("Score de volume de compras = " + pCompras + " pontos");
		System.out.println();

		// Scores de inadimplencia
		if (atraso > 1 || vCompras == 0) {
			pInadimplencia = 0;
		} else if (vCompras > 0 && atraso == 0) {
			pInadimplencia = 30;
		} else if (vCompras > 0 && atraso == 1) {
			pInadimplencia = 15;
		}

		// Score de forma de pagamento
		if ((fPagamento == 'd' || fPagamento == 'D') && vCompras > 0) {
			pForma = 5;
		} else if (vCompras > 0) {
			pForma = 10;
		}

		System.out.println("Score de inadimpl�ncia = " + pInadimplencia + " pontos");
		System.out.println("Score de forma de pagamento = " + pForma + " pontos");
		System.out.println();

		// Classifica��o final
		if (pCompras + pInadimplencia + pForma <= 25) {
			classificacao = "BRONZE";
		} else if (pCompras + pInadimplencia + pForma > 25 && pCompras + pInadimplencia + pForma <= 75) {
			classificacao = "PRATA";
		} else {
			classificacao = "OURO";
		}

		System.out.println("Classifica��o final = CLIENTE " + classificacao);
		sc.close();

	}

}
