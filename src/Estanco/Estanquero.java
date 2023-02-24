package Estanco;

public class Estanquero extends Thread {

	private BufferMesa mesa;

	public Estanquero(BufferMesa mesa) {
		super();
		this.mesa = mesa;
	}

	@Override
	public void run() {
		while (true) {

			String frase = "El estanquero no pone el ingrediente: ";

			//long tiempoEspera = (long) ((Math.random() * 3) * 1000);

			for (int i = 0; i <= 2; i++) {
				//if (mesa.isVacia()) {
					switch (i) {
					case 0:
						mesa.poner(0);
						System.out.println(frase + "0");
						
						break;
					case 1:
						mesa.poner(1);
						System.out.println(frase + "1");
						
						break;
					case 2:
						mesa.poner(2);
						System.out.println(frase + "2");
						
						break;
					}
				//}
			}
		}
	}
}
