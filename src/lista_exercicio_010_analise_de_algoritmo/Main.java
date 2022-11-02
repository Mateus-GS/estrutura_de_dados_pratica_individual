package lista_exercicio_010_analise_de_algoritmo;

public class Main {

	public static void inverter(int vetor[], int primeiraPosicao, int segundaPosicao) {
		int auxiliar;
		if (primeiraPosicao < segundaPosicao) {
			auxiliar = vetor[primeiraPosicao];
			vetor[primeiraPosicao] = vetor[segundaPosicao];
			vetor[segundaPosicao] = auxiliar;
			inverter(vetor, primeiraPosicao + 1, segundaPosicao - 1);

		}
	}

	public static void main(String[] args) {

		int vetor[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		inverter(vetor, 0, vetor.length - 1);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

}
