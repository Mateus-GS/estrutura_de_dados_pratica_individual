package lista_exercicio_1;

public class Main {

	public static void main(String[] args) {
		Agenda a = new Agenda(4);
		if (!a.cheio()) {
			a.adicionar("Mateus", "(31) 996798856");
		} else {
			System.out.println("Agenda cheia");
		}
		
		if (!a.cheio()) {
			a.adicionar("Vinicus JR", "(31) 996798856");
		} else {
			System.out.println("Agenda cheia");
		}
		
		if (!a.cheio()) {
			a.adicionar("Vinicius", "(31) 996798856");
		} else {
			System.out.println("Agenda cheia");
		}
		
		System.out.println(a.top());
		a.remover();
		System.out.println(a.top());
		System.out.println(a.tamanho());

	}

}
