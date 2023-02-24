package segundam;

public class mainHilos {

	public static void main(String[] args) {

		
		
		try {
			Hilo1 hilo1 = new Hilo1(2000, 10);
			Hilo1 hilo2 = new Hilo1(300, 9);
			hilo1.start();
			hilo2.start();
		}catch(Exception e){
			System.err.println(e);
		}
		
		
//		try {
//			Hilo2 hiloItf = new Hilo2();
//		hiloItf.run();
//		
//		}catch(Exception e){
//			System.out.println(e);
//		}
	}

}
