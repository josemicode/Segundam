package segundam;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ficheroTest {

	public static void main(String[] args) throws IOException {

		/*
		//------------------------------------------------------------------------------------------------------------------------------------------------

		File fichero = new File("C:\\Users\\Usuario\\Desktop\\PDF's\\Tostadas\\fichero");
		File carpeta = new File("C:\\Users\\Usuario\\Desktop\\CARPETERO\\cap1");
		//File fichero2 = new File("C:\\Users\\Usuario\\Desktop\\Nueva Carpeta\\Funciona\\JAJA\\Joseju\\Cosas\\D");
		//fichero2.mkdirs();
		fichero.createNewFile();
		carpeta.mkdirs();
		
		File fichOrigen = new File("C:\\Users\\Usuario\\Desktop\\CARPETERO\\prueba1");
		fichOrigen.createNewFile();
		File fichDestino = new File("C:\\Users\\Usuario\\Desktop\\CARPETERO\\cap1\\prueba1.txt");
		
		if(fichOrigen.renameTo(fichDestino)) {
			System.out.println("A");
		}else {
			System.out.println("No A");
		}
		
		*/
		Scanner sc = new Scanner(System.in);
		//------------------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		String fileName = sc.next();
		String dirPath = "C:\\Users\\Usuario\\Desktop\\CARPETERO\\";
		String path = dirPath+fileName;
		File customFile = new File(path);
		customFile.createNewFile();
		
		String probando = "probando micro";
		byte[] byteArray = probando.getBytes();
		
		FileOutputStream output = new FileOutputStream(path);
		
		output.write(byteArray);
		output.close();
		*/
		
		//------------------------------------------------------------------------------------------------------------------------------------------------

		int bufferSize = 4 * 1024;
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Usuario\\Desktop\\CARPETERO\\cap1\\prueba1.txt"), bufferSize);
		int info = bufferedInputStream.read();
		
		while(info!=-1) {
			info = bufferedInputStream.read();
		}
		
		bufferedInputStream.close();

	}

}
