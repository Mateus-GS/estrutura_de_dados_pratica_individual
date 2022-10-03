package lista_exercicio_2;

public class Pilha {
	// Atributos
    private double[] itensPilha;
	private double[] itensPilha2;
    private int topo;
    private int tam_max;
    
	public Pilha(int n)  {
		itensPilha = new double[n];
		itensPilha2 = new double[(n*2)];
        tam_max = n;
        topo = 0;
    }
	
    public void inserir(double dado) {
    	if (!this.cheio()) {
    		itensPilha[topo] = dado;
    		topo++;
    	} else {
    		for (int i = 0; i < itensPilha.length; i++) {
				itensPilha2[i] = itensPilha[i];
				
			}
    	}
    }
    
    public boolean cheio() {
        return (topo == tam_max);
    }
    
    public boolean vazio() {
        return (topo == 0);
    }
    
    public void novoVetor() {
//    	System.out.println(itensPilha2[0]);
    	if (itensPilha2[0] == 0.0) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
    }
}
