package polimorfismo;

public class Cavalo extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Relincha");
		
	}

	@Override
	public void correr() {
		System.out.println("Trota");
		
	}

}
