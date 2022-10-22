package lista_exercicio_9_ordenacao_pratica;

import java.util.Random;
//import java.util.Scanner;

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

	public static void mergeSort(int tamanho, int[] vetor) {
		int elementos = 1;
		int inicio, meio, fim;

		while (elementos < tamanho) {
			inicio = 0;
			while (inicio + elementos < tamanho) {
				meio = inicio + elementos;
				fim = inicio + 2 * elementos;
				if (fim > tamanho)
					fim = tamanho;

				intercala(vetor, inicio, meio, fim);

				inicio = fim;
			}

			elementos = elementos * 2;
		}
	}

	public static void intercala(int[] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;

		while (i < meio && m < fim) {
			if (vetor[i] <= vetor[m]) {
				novoVetor[pos] = vetor[i];
				pos = pos + 1;
				i = i + 1;
			} else {
				novoVetor[pos] = vetor[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		while (i < meio) {
			novoVetor[pos] = vetor[i];
			pos = pos + 1;
			i = i + 1;
		}

		while (m < fim) {
			novoVetor[pos] = vetor[m];
			pos = pos + 1;
			m = m + 1;
		}

		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vetor[i] = novoVetor[pos];
		}
	}

	public static void bubbleSort(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = vector.length - 1; j > i + 1; j--) {
				if (vector[j] < vector[j - 1]) {
					int temp = vector[j];
					vector[j] = vector[j - 1];
					vector[j - 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		int arrayAleatorio[] = new int[100];
		int arrayCrecente[] = new int[100];
		int arrayDecrescente[] = new int[100];
		int aux = 0;

		// Criando array Aleatório
		for (int i = 0; i < arrayAleatorio.length; i++) {
			arrayAleatorio[i] = random.nextInt(1000);
		}

		// Criando array Crescente
		for (int i = 0; i < arrayCrecente.length; i++) {
			arrayCrecente[i] = i;
		}

		// Criando array Decrescente
		for (int i = arrayDecrescente.length; i > 0; i--) {
			arrayDecrescente[aux] = i;
			aux++;
		}
		
		System.out.println("========= bubbleSort ==========");
		bubbleSort(arrayAleatorio);
		for (int i = 0; i < arrayAleatorio.length; i++) {
			System.out.print(arrayAleatorio[i] + " ");
		}
		
		System.out.println("\n========= insertionSort ==========");
		insertionSort(arrayAleatorio);
		for (int i = 0; i < arrayAleatorio.length; i++) {
			System.out.print(arrayAleatorio[i] + " ");
		}
	}

}
