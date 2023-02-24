package Estanco;

public class Fumador1 extends Thread{

	private BufferMesa mesa;

	public Fumador1(BufferMesa mesa) {
		super();
		this.mesa = mesa;
	}

	@Override
	public void run() {
		while(true) {
			if (mesa.coger()==2) {
				System.out.println("El fumador 1 empieza a fumar.");
				
				try {
					sleep((long) (Math.random()*3)*1000);
				}catch (Exception e) {}
				
				System.out.println("El fumador 1 termina de fumar.");
				mesa.fumar();
			}
		}
	}
}
