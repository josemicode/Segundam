package Estanco;

public class mainEstanco {

	public static void main(String[] args) {

		BufferMesa mesa = new BufferMesa();
		Estanquero estanquero = new Estanquero(mesa);
		Fumador0 fumador0 = new Fumador0(mesa);
		Fumador1 fumador1 = new Fumador1(mesa);
		Fumador2 fumador2 = new Fumador2(mesa);

		estanquero.start();
		fumador0.start();
		fumador1.start();
		fumador2.start();
	}
}
