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
		int arrayAleatorio[] = new int[10000];
		int arrayCrecente[] = new int[10000];
		int arrayDecrescente[] = new int[10000];
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
		
		long startTime = System.currentTimeMillis();
		
		// Criando cópias dos arrays Bubble
		int [] arrayAleatorioBubble = arrayAleatorio.clone();
		int [] arrayCrecenteBubble = arrayCrecente.clone();
		int [] arrayDecrescenteBubble = arrayDecrescente.clone();
		
		// Criando cópias dos arrays Merge
		int [] arrayAleatorioMerge = arrayAleatorio.clone();
		int [] arrayCrecenteMerge = arrayCrecente.clone();
		int [] arrayDecrescenteMerge = arrayDecrescente.clone();
		
		// Criando cópias dos arrays Insertion
		int [] arrayAleatorioInsertion = arrayAleatorio.clone();
		int [] arrayCrecenteInsertion = arrayCrecente.clone();
		int [] arrayDecrescenteInsertion = arrayDecrescente.clone();
		
		// Exibindo resultado Bubble Sort
		System.out.println("========= Bubble Sort ==========");
		startTime = System.currentTimeMillis();
		bubbleSort(arrayAleatorioBubble);
		System.out.println("Bubble Sort array aleatório time: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		bubbleSort(arrayCrecenteBubble);
		System.out.println("Bubble Sort array crecente time: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		bubbleSort(arrayDecrescenteBubble);
		System.out.println("Bubble Sort array decrescente time: " + (System.currentTimeMillis() - startTime));
		
		// Exibindo resultado Merge Sort
		System.out.println("========= Merge Array ==========");
		startTime = System.currentTimeMillis();
		bubbleSort(arrayAleatorioMerge);
		System.out.println("Merge Sort array aleatório time: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		bubbleSort(arrayCrecenteMerge);
		System.out.println("Merge Sort array crecente time: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		bubbleSort(arrayDecrescenteMerge);
		System.out.println("Merge Sort array decrescente time: " + (System.currentTimeMillis() - startTime));
		
		// Exibindo resultado Insertion
		System.out.println("========= Insertion Array ==========");
		startTime = System.currentTimeMillis();
		bubbleSort(arrayAleatorioInsertion);
		System.out.println("Insertion array aleatório time: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		bubbleSort(arrayCrecenteInsertion);
		System.out.println("Insertion array crecente time: " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		bubbleSort(arrayDecrescenteInsertion);
		System.out.println("Insertion array decrescente time: " + (System.currentTimeMillis() - startTime));

	}

}
