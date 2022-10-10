package lista_exercicio_5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String letra;
		Scanner entrada = new Scanner(System.in);
		int contMax = 1, contMin = 1;
		int auxMax = 0, auxMin = 0;
		char vetorMaiusculo[] = new char[contMax];
		char vetorMinusculo[] = new char[contMax];

		while (true) {
			System.out.print("Digite uma letra: ");
			letra = entrada.nextLine();
			if ("".equals(letra)) {
				System.out.println("Finalizando ...");
				break;
			} else {
				char c1 = letra.charAt(0);
				if (Character.isUpperCase(c1)) {
					vetorMaiusculo[auxMax] = c1;
					contMax++;
					auxMax++;
					char novoVetorMaiusculo[] = new char[contMax];

					for (int i = 0; i < vetorMaiusculo.length; i++) {
						novoVetorMaiusculo[i] = vetorMaiusculo[i];
					}
					vetorMaiusculo = novoVetorMaiusculo;
				} else {
					vetorMinusculo[auxMin] = c1;
					contMin++;
					auxMin++;

					char novoVetorMinusculo[] = new char[contMin];

					for (int i = 0; i < vetorMinusculo.length; i++) {
						novoVetorMinusculo[i] = vetorMinusculo[i];
					}
					vetorMinusculo = novoVetorMinusculo;
				}
			}
		}
		System.out.println("========== Vetor Maiúsculo ==========");
		for (int i = 0; i < vetorMaiusculo.length; i++) {
			System.out.print(vetorMaiusculo[i]);
		}

		System.out.println("\n========== Vetor Minúsculo ==========");
		for (int i = 0; i < vetorMinusculo.length; i++) {
			System.out.print(vetorMinusculo[i]);
		}
	}
}
