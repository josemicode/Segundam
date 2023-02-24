package Estanco;

public class BufferMesa {
	
	private final int tabaco, papel, fosforo;
	private int lote;
	private boolean vacia, fumando;
	
	public BufferMesa() {
		super();
		this.tabaco = 0;
		this.papel = 1;
		this.fosforo = 2;
		this.vacia = true;
		this.fumando = false;
	}
	
	public synchronized void poner(int ingrediente) {
		
		while(!vacia && fumando) {
			try {
				wait();
			}catch (Exception e) {}
		}
		
		switch(ingrediente) {
		case 0:
			lote = papel + fosforo;
			break;
		case 1:
			lote = tabaco + fosforo;
			break;
		case 2:
			lote = tabaco + papel;
			break;
		}
		
		vacia = false;
		notifyAll();
	}
	
	public synchronized int coger() {
		while(vacia && fumando) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		fumando = true;
		vacia = true;
		
		notifyAll();
		return lote;
	}
	
	public synchronized void fumar() {
		while(!fumando && !vacia) {
			try {
				wait();
			}catch (Exception e) {}
		}
		
		fumando = true;
		notifyAll();
	}
	
	public synchronized boolean isVacia() {
		notifyAll();
		return vacia;
	}
}
