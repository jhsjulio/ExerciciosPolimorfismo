package polimorfismo;

public class Zoologico {
	
	    private Animal[] jaulas;

	    public Zoologico() {
	        jaulas = new Animal[10];
	        
	        jaulas[0] = new Cachorro();
	        jaulas[2] = new Cavalo();
	        jaulas[4] = new Preguica();
	        jaulas[6] = new Cachorro();
	        jaulas[8] = new Cavalo();
	        jaulas[9] = new Preguica();
	        
	    }

	    public void visitarJaulas() {
	        for (int i = 0; i < jaulas.length; i++) {
	            System.out.println("Visitando Jaula " + (i + 1));
	            if (jaulas[i] != null) {
	                jaulas[i].emitirSom();
	                jaulas[i].correr();
	                
	            } else {
	                System.out.println("Jaula vazia.");
	            }
	            System.out.println();
	        }
	    }

	    
}
