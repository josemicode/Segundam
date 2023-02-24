package PSP.tema4;

public class act2 implements Runnable{

	private String msg;

	public act2(String msg) {
		super();
		this.msg = msg;
	}
		
	@Override
	public void run() {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		act2 rn = new act2("¡Hola, te saludo desde un hilo!");
		rn.run();
	}

}
