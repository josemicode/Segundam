package PSP.tema4;

public class act1 extends Thread {

	private String msg;

	public act1(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		act1 th = new act1("¡Hola, te saludo desde un hilo!");
		th.run();
	}
}
