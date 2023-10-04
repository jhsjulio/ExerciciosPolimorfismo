package polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		Cavalo h = new Cavalo ();
		Preguica p = new Preguica();
		
		Veterinario v = new Veterinario();
		
		c.emitirSom();
		h.emitirSom();
		p.emitirSom();
		
		v.examinar(p);
		v.examinar(h);
		v.examinar(c);
		
		
		Zoologico zoologico = new Zoologico();
        zoologico.visitarJaulas();
	}

}
