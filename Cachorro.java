package polimorfismo;

public class Cachorro extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Late");
		
	}

	@Override
	public void correr() {
		System.out.println("Corre");
		
	}


}
