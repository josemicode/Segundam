package PSP.tema4;

public class act3 extends Thread{
	
	int retraso;
	int topNum;

	public act3(int retraso, int topNum) {
		super();
		this.retraso = retraso;
		this.topNum = topNum;
	}

	@Override
	public void run() {
		for(int i = 1; i <= topNum; i++) {
			System.out.println(i);
			try {
				sleep(retraso);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		act3 th = new act3(1500, 20);
		th.start();
	}

}
