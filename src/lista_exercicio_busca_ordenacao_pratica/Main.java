package lista_exercicio_busca_ordenacao_pratica;

import java.util.*;

public class Main {

	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static boolean buscaBinaria(int x, int numeros[]) {
		int inicio = 0, fim = numeros.length - 1;
		int meio;
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (x == numeros[meio]) {
				System.out.println("O número " + numeros[meio] + " se encontra na posição: " + meio);
				return true;
			}
			if (x < numeros[meio])
				fim = meio - 1;
			else
				inicio = meio + 1;
		}
		System.out.println("Não possui o valor " + x + " no vetor.");
		return false;
	}

	public static void buscaSequencial(int valor, int vetor[]) {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				cont++;
			}
		}
		System.out.println("Possui o total de " + cont + " números " + valor + " no vetor.");
	}

	public static void main(String[] args) {
		// Gerando array com números aleatórios
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual número deseja saber a posição: ");
		int opc = entrada.nextInt();
		int arrayInsertionSort[] = new int[500];

		for (int i = 0; i < arrayInsertionSort.length; i++) {
			arrayInsertionSort[i] = random.nextInt(10000);
		}

		// Executando insertionSort
		insertionSort(arrayInsertionSort);
		
		// Executando Busca Binaria
		long comecoBinario = System.currentTimeMillis();
		buscaBinaria(opc, arrayInsertionSort);
		long fimBinario = System.currentTimeMillis();
		
		// Executando Busca Sequencial
		long comecoSequencial = System.currentTimeMillis();
		buscaSequencial(opc,arrayInsertionSort);
		long fimSequencial = System.currentTimeMillis();
		
        // Imprimindo resultado
        System.out.println("============ Tempo de execução Busca Binária ==================");
        System.out.println(fimBinario - comecoBinario);
        System.out.println("============ Tempo de execução Busca Sequencial ==================");
        System.out.println(fimSequencial - fimBinario);
		
	}

}
