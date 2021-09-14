
public class Main {
	public static void main (String[] args) {
	    
	    Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No("Primeira"));
		minhaFila.enqueue(new No("Segunda"));
		minhaFila.enqueue(new No("Terceira"));
		minhaFila.enqueue(new No("Quarta"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue(new No("Último"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
	}
}

