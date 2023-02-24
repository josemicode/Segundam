package Protocolos1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {
	public static void main(String[] args) {
		
		ServerSocket SVSC = null;
		Socket SC = null;
		DataInputStream DIS;
		DataOutputStream DOS;
		
		final int DOCK = 5050;
		
		try {
			SVSC = new ServerSocket (DOCK);
			System.out.println("Server Online");
			
			while(true) {
				SC = SVSC.accept();
				System.out.println("Client Accepted");
				
				DIS = new DataInputStream(SC.getInputStream());
				DOS = new DataOutputStream(SC.getOutputStream());
				
				String  msg = DIS.readUTF();
				System.out.println(msg);
				
				DOS.writeUTF("Hello World - Server");
				
				SC.close();
				if(SC.isClosed()) {
					System.out.println("Client Offline");
				}
			}
		}catch(Exception e) {
			System.err.println(e);
		}
		
		
	}
}
