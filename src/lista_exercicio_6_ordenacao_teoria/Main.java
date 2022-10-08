package lista_exercicio_6_ordenacao_teoria;

import java.util.Scanner;

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
	
    static void exibirArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
    
    public static void insertionSortDecrescente (int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
	public static void main(String[] args) {
		/* Nome: Mateus Gon�alves de Souza | RA: 119122458 
			Exercicio 1
			Usando o algoritmo apresentado, ilustre a opera��o de Insertion-Sort no arranjo A = <31, 41, 59, 26, 41, 58>.
		*/
		
		int A[] = {31, 41, 59, 26, 41, 58};
		insertionSort(A);
		System.out.println("Ordem crescente");
		exibirArray(A);
		
		/* Exercicio 2
			Reescreva o procedimento Insertion-Sort para ordenar em ordem n�o crescente, em vez da ordem n�o decrescente.
		*/
		insertionSortDecrescente(A);
		System.out.println("Ordem decrescente");
		exibirArray(A);
		
		/* Exercicio 3
			Considere o seguinte problema:
			- Entrada: Uma sequ�ncia de n n�meros A = <a1, a2, ..., an> e um valor v.
			- Sa�da: Um �ndice i, tal que v == A[i], ou o valor especial NULO, se v n�o aparecer em A.
			� Escreva um algoritmo para a pesquisa linear, que fa�a uma varredura da sequ�ncia,procurando por v. Usando um loop invariante, prove que seu algoritmo � correto.Certifique-se de que seu loop invariante satisfaz �s tr�s propriedades necess�rias.
		*/  
		Scanner menu = new Scanner (System.in);
		int segundoArray[] = {31, 41, 59, 26, 41, 58};
		int num;
		int sum = 0;
    	System.out.print("Num : ");
    	
		num = menu.nextInt();
		
		for (int i = 1; i <= segundoArray.length; i++) {
			if ( (sum += i) == num )
				System.out.print(sum); 
		}
		
	}

}
