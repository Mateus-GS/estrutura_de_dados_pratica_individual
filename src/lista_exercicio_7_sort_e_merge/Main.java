package lista_exercicio_7_sort_e_merge;

import java.util.Random;

public class Main {
	
	public static void insertionSort(int arr[])
    {
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
		    
		    while(elementos < tamanho) {
		      inicio = 0;
		      while(inicio + elementos < tamanho) {
		        meio = inicio + elementos;
		        fim = inicio + 2 * elementos;
		        if(fim > tamanho)
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

		    while(i < meio && m < fim) {
		      if(vetor[i] <= vetor[m]) {
		        novoVetor[pos] = vetor[i];
		        pos = pos + 1;
		        i = i + 1;
		      } else {
		        novoVetor[pos] = vetor[m];
		        pos = pos + 1;
		        m = m + 1;
		      }
		    }
		    
		    while(i < meio) {
		      novoVetor[pos] = vetor[i];
		      pos = pos + 1;
		      i = i + 1;
		    }

		    while(m < fim) {
		      novoVetor[pos] = vetor[m];
		      pos = pos + 1;
		      m = m + 1;
		    }
		    
		    for(pos = 0, i = inicio; i < fim; i++, pos++) {
		      vetor[i] = novoVetor[pos];
		    }
		  }
		
	
	public static void main(String[] args) {
		// Gerando array com números aleatórios
        Random random = new Random();
        int arrayInsertionSort[] = new int[20000];
        
        for (int i=0; i<arrayInsertionSort.length; i++) {
        	arrayInsertionSort[i] = 10 + random.nextInt(100);
        }
        
        // Clonado array
        int [] arrayMergeSort = arrayInsertionSort.clone();
        
        // Executando insertionSort
        long comecoInsertionSort = System.currentTimeMillis();
        insertionSort(arrayInsertionSort);
        long fimInsertionSort = System.currentTimeMillis();

        // Executando mergeSort
        long comecoMergeSort = System.currentTimeMillis();
        mergeSort(arrayMergeSort.length, arrayMergeSort);
        long fimMergeSort = System.currentTimeMillis();
        
        // Imprimindo resultado
        System.out.println("============ Tempo de execução Insertion Sort ==================");
        System.out.println(fimInsertionSort - comecoInsertionSort);
        System.out.println("============ Tempo de execução Merge Sort ==================");
        System.out.println(fimMergeSort - comecoMergeSort);
        
	}

}
