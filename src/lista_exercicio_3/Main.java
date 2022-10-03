package lista_exercicio_3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		Parte 1
		Scanner entrada = new Scanner(System.in);
		System.out.println("PROGRAMA PILHA\n" + "0: Sair\n" + "1: Inserir itens\n" + "2: Remover itens\n"
				+ "3: Imprimir tamanho\n" + "4: Imprimir item topo");
		System.out.println("Entre com a op��o desejada: ");
		int opc = entrada.nextInt();
		Pilha p = new Pilha();
		p.adicionar("Mateus Gonçalves");
		switch (opc) {
		case 1:
			if (!p.cheio()) {
				System.out.print("Digite seu nome: ");
				String nome = entrada.next();
				p.adicionar(nome);
				System.out.print("Nome cadastrado: " + nome);
			} else {
				System.out.println("Agenda cheia");
			}
			break;
		case 2:
			if (!p.cheio()) {
				p.remover();
				System.out.println("Item removido");
			}
			break;
		case 3:
			System.out.println("O tamanha da pilha é: " + p.tamanho());
			break;
		case 4:
			if (!p.cheio()) {
				p.top();
				System.out.println("O primeiro item é: " + p.top());
			}
			break;
		default:
			System.out.println("Saindo");
			break;
		}
		
//		Parte 2
		Pilha2 p2 = new Pilha2();
		p2.push(3);
		p2.push(9);
		p2.push(5);
		p2.push(1);
		p2.push(2);
		p2.pop();
		p2.pop();
		p2.top();
		p2.pop();
		p2.push(7);
		p2.pop();
		p2.pop();
		p2.push(4);
		p2.pop();
		p2.pop();
		p2.push(8);
		p2.push(6);
		p2.pop();
//		System.out.println(p2.top());
		p2.inverterPosicaoPilha();
		
	}

}
