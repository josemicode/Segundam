package segundam;

public class Hilo1 extends Thread{

	private int mimir;
	private int regValue;
	
	
	
	public Hilo1(int mimir, int regValue) {
		super();
		this.mimir = mimir;
		this.regValue = regValue;
	}



	@Override
	public void run() {
		//while(true) {
			for(int i = 1; i <= regValue; i++) {
				System.out.println(i);
				try {
					sleep(mimir);
				}catch(Exception e) {
					System.err.println(e);
				}
			}
		//}
	}
	
}
