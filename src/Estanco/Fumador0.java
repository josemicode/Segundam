package Estanco;

public class Fumador0 extends Thread{

	private BufferMesa mesa;

	public Fumador0(BufferMesa mesa) {
		super();
		this.mesa = mesa;
	}

	@Override
	public void run() {
		while(true) {
			if (mesa.coger()==3) {
				System.out.println("El fumador 0 empieza a fumar.");
				
				try {
					sleep((long) (Math.random()*3)*1000);
				}catch (Exception e) {}
				
				System.out.println("El fumador 0 termina de fumar.");
				mesa.fumar();
			}
		}
	}
	
	
}
