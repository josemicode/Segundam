package segundam;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Actividad_TEMA1 {
	
	public static void main(String[] args) throws IOException {
		
		webTextExtractor extWeb = new webTextExtractor();

		String link = "https://www.yourtango.com/2018311166/50-best-quotes-famous-philosophers-about-life";
		String texto = extWeb.getText(link);
		String parrafo1 =  ajustarTexto(texto).substring(2881,3102);
		String parrafo2 = ajustarTexto(texto).substring(3102,3203);
		
		String ruta = "C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1";
		
		File carpeta = new File(ruta);
		carpeta.mkdir();
		File archivo = new File(ruta+"\\Actividad_File.txt");
		archivo.createNewFile();
		
		FileWriter fw = new FileWriter(archivo);
		fw.write(parrafo1);
		fw.write("\n\n");
		fw.write(parrafo2);
		fw.close();
		
		LineNumberReader lnr = new LineNumberReader(new FileReader(archivo));
		while(lnr.readLine()!=null);
		
		int LIO = archivo.toString().lastIndexOf('.');
		int numChars = archivo.toString().length();
		int numLines = lnr.getLineNumber();
		
		DateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy hh:mm a");
		
		System.out.println("Nombre: " + archivo.getName() + "\n"+
				"Extensión: " + archivo.toString().substring(LIO+1,numChars) + "\n"+
				"Ruta Absoluta: " + archivo.getAbsolutePath() + "\n"+
				"Tamaño: " + archivo.getTotalSpace() + " bytes" + "\n"+
				"Última modificación: " + sdf.format(archivo.lastModified()) + "\n"+
				"Número de líneas: " + numLines);
		
		
	}
	
	private static String ajustarTexto(String text) {
		
		CharArrayWriter arrWriter = new CharArrayWriter();
		CharArrayReader arrReader;
		
		int data = 0;
		String res = "";
		
		try {
			
			arrWriter.write(text);
			arrWriter.close();
			
			arrReader = new CharArrayReader(arrWriter.toCharArray());
			data = arrReader.read();
			
			int wordCounter = 0;
			
			while (data != -1) {
				if(((char) data == ' ')) {
					if(wordCounter==10) {
						res += "\n";
						wordCounter=0;
					}else {
						wordCounter++;
					}
					res += ' ';
					
					//System.out.println("111");
					
				}else {
					res += (char) data;
					//System.out.println("000");
				}
				
				data = arrReader.read();
			}
		}catch(Exception ex){
			System.out.println(ex.toString());
		}
		
		return res;
		
	}
	
}
