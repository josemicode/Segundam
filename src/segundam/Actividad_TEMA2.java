package segundam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Actividad_TEMA2 {

	public static void main(String[] args) throws IOException {


		String ruta = "C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1";
		File archivo = new File(ruta+"\\Actividad_File.txt");
		
		BufferedReader bf = new BufferedReader(new FileReader(archivo));
		BufferedReader bf2 = new BufferedReader(new FileReader(archivo));
		BufferedReader bf3 = new BufferedReader(new FileReader(archivo));

		
		Scanner sc = new Scanner(bf).useDelimiter("\n\n");
		
		String paragraph = sc.next();
		String paragraph2 = sc.next();
		    
		sc.close();
		
		 		 
		int numLineasP1 = lineCount(paragraph);
		int numLineasP2 = lineCount(paragraph2);
		 
		Scanner sc2 = new Scanner(bf2).useDelimiter("\n");
		Scanner sc3;
		
		List<String> listaPalabras = new ArrayList<String>();
		
		
		
		while (sc2.hasNext()) {
			
			sc3 = new Scanner(sc2.next()).useDelimiter(" ");
			
			while (sc3.hasNext()) {
			    String word = sc3.next();
			    listaPalabras.add(word);
			    
			}
		
		    
			listaPalabras.add("<>");
	    
		}
		
		
		
		List<String> aux = new ArrayList();
		List<String> primerasPal = new ArrayList();
		List<String> randomPal = new ArrayList();
		Random rd = new Random();
		int contador = 0;
		
		for(String elemento : listaPalabras) {
			
			if(!elemento.equals("<>")) {
				aux.add(elemento);
			}else {
				
				if(!aux.isEmpty()) {
					contador++;
					primerasPal.add("Primera palabra de la línea " + contador + " es: " + aux.get(0));
					randomPal.add(aux.get(rd.nextInt(aux.size())) + " - " + contador);
				}
				
				aux.clear();
			}
		}
		
		
		String textoFINAL = ("");
		
		for(int i = 0; i < (numLineasP1+numLineasP2); i++) {
			textoFINAL += (primerasPal.get(i) + " \n");
		}
		
		textoFINAL += "\nPalabras Aleatorias: \n";
		
		for(int i = 0; i < (numLineasP1+numLineasP2); i++) {
			textoFINAL += (randomPal.get(i) + " \n");
		}
		
		textoFINAL += ("\nPárrafo 1 tiene " + numLineasP1 + " líneas." + "\n"+
					     "Párrafo 2 tiene " + numLineasP2 + " líneas.");
		
		File archivo2 = new File(ruta+"//Actividad_TEMA2_extracion.txt");
		archivo2.createNewFile();
		
		FileWriter fw = new FileWriter(archivo2);
		fw.write(textoFINAL);
		fw.close();
		
	}
	
	 public static int lineCount(String cadena) {
		 
	      return cadena.split("[\n|\r]").length;
	 }
	 
	 public static String wordAt(File archivo) {
		 String res="";
		 
		 
		
		 return res;
	 }
}
