package lista_exercicio_3;

public class Pilha {
    // Atributos
    private String[] agendas;
    private String nome;
    
    private int topo;
    private int tam_max;
    
    public Pilha() {
    	agendas = new String[2];
//    	int[] pilha = {3,9,5,1};
    	tam_max = 2;
    	topo = 0;
    }
    
    public void adicionar(String nome) {
    	agendas[topo] = nome;
    	topo++;
    }
    
    public void remover() {
    	topo--;
    }
    
    public String top() {
    	return agendas[topo -1];
    }
    
    public boolean vazio() {
        return (topo == 0);
    }

    public boolean cheio() {
        return (topo == tam_max);
    }

    public int tamanho() {
        return tam_max;
    }
}
