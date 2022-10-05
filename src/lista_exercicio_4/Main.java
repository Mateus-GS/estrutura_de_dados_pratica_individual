package lista_exercicio_4;

import java.util.*;

public class Main {
	// Atividade 1
	// Crie uma função recursiva que receba um número  inteiro positivo N e calcule o somatório dos números  de 1 a N.
	private static int soma(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + soma(n - 1);
		}
	}
	
	// Atividade 2
	// Faça uma função recursiva que receba um número  inteiro positivo N e imprima todos os números  naturais de 0 até N em ordem crescente.
	private static int imprimir(int n, int y) {
		if (y != n) {
			System.out.print(y+ ", ");
			return imprimir(n ,y + 1);
		} else {
			return n;
		}

	}
	
	// Atividade 3
	// Crie um programa, que contenha uma função  recursiva que receba dois inteiros positivos k e n e  calcule kn. Utilize apenas multiplicações. O programa  principal deve solicitar ao usuário os valores de k e n  e imprimir o resultado da chamada da função.
//	private static int expoente(int k, int n) {
//		return k * n;
//	}
	
	private static int expoente(int k, int n) {
		if (n == 1) {
			return k;
		} else {
			return k * expoente(k, n -1);
		}
	}
	
	
	public static void main(String[] args) {
		int n, resposta, respota2, k1, k2;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Forneça um número: ");
		n = entrada.nextInt();
		// Atividade 1
		// Crie uma função recursiva que receba um número  inteiro positivo N e calcule o somatório dos números  de 1 a N.
		resposta = soma(n);
		System.out.println("O somatorio é: " + n + " = " + resposta);
		
		// Atividade 2
		// Faça uma função recursiva que receba um número  inteiro positivo N e imprima todos os números  naturais de 0 até N em ordem crescente.
		System.out.println("======= Sequência 0 a "+ n + "========");
		System.out.println(imprimir(n , 0));
		
		// Atividade 3
		// Crie um programa, que contenha uma função  recursiva que receba dois inteiros positivos k e n e  calcule kn. Utilize apenas multiplicações. O programa  principal deve solicitar ao usuário os valores de k e n  e imprimir o resultado da chamada da função.
		
		System.out.print("Digite valor de k: ");
		k1 = entrada.nextInt();
		System.out.print("Digite valor de N: ");
		k2 = entrada.nextInt();
		System.out.println("O resultado é: " + expoente(k1 , k2));
	}

}
