package lista_exercicio_3;

public class Pilha2 {
	private int[] itens;
	private int topo;
	private int tam_max;
	private int base;
	
    public Pilha2() {
    	itens = new int[10];
    	tam_max = 2;
    	topo = 0;
    	base = 0;
    }
    
	  public void push(int valor) {
	      itens[topo] = valor;
	      System.out.println("Adicionando item " + itens[topo]);
	      topo++;
	  }
	  
	  public void pop() {
	  	topo--;
	  }
	  
	  public int top() {
	      return itens[topo - 1];
	  }
	  
	  public void  inverterPosicaoPilha() {
	    base = itens[base];
	    int topoPilha  = itens[topo];

	    itens[topo] = base ;
	    itens[base] = topoPilha;
	    System.out.println(itens[base]);
		}
}
