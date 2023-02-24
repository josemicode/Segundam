package Protocolos1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx1 {

	public static void main(String[] args) {

		final String HOST = "127.0.0.1";
		final int DOCK = 5050;
		DataInputStream DIS;
		DataOutputStream DOS;
		
		try {
			Socket SC = new Socket(HOST, DOCK);
			
			DIS = new DataInputStream(SC.getInputStream());
			DOS = new DataOutputStream(SC.getOutputStream());
			
			DOS.writeUTF("Hello World - Client");
			
			String msg = DIS.readUTF();
			System.out.println("Message Sent");
			
			SC.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
