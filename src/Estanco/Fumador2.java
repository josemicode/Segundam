package Estanco;

public class Fumador2 extends Thread{

	private BufferMesa mesa;

	public Fumador2(BufferMesa mesa) {
		super();
		this.mesa = mesa;
	}

	@Override
	public void run() {
		while(true) {
			if (mesa.coger()==1) {
				System.out.println("El fumador 3 empieza a fumar.");
				
				try {
					sleep((long) (Math.random()*3)*1000);
				}catch (Exception e) {}
				
				System.out.println("El fumador 3 termina de fumar.");
				mesa.fumar();
			}
		}
	}
}
