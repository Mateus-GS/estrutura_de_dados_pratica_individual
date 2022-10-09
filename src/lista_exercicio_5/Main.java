package lista_exercicio_5;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		String letra;
		Scanner entrada = new Scanner(System.in);
		int cont = 6;
		int auxMax = 0, auxMin = 0;
		char vetorMaiusculo[] = new char[cont];
		char vetorMinusculo[] = new char[cont];

		while (true) {
			System.out.print("Digite uma letra: ");
			letra = entrada.nextLine();	
	        if("".equals(letra)) {
	        	System.out.println("Finalizando ...");
	            break;
	        }else {
	        	char c1 = letra.charAt(0);
	        	if (Character.isUpperCase(c1)) {
	        		vetorMaiusculo[auxMax] = c1;
	        		auxMax++;
				} else {
					vetorMinusculo[auxMin] = c1;
					auxMin++;
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
