package polimorfismo;

public class Veterinario {
	
	public void examinar(Animal animal) {
		System.out.println("Examinando o animal: ");
        animal.emitirSom();
	}
}
