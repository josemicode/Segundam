package segundam;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class ArrayReader1 {

	public static void main(String[] args) {


		CharArrayWriter arrWriter = new CharArrayWriter();
		CharArrayReader arrReader;
		
		int data = 0;
		
		try {
			
			arrWriter.write("Muy buenas");
			arrWriter.close();
			
			arrReader = new CharArrayReader(arrWriter.toCharArray());
			data = arrReader.read();
			
			while (data != -1) {
				System.out.println((char) data);
				data = arrReader.read();
			}
		}catch(Exception ex){
			System.out.println(ex.toString());
		}
	}

}
