package segundam;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class webTextExtractor {
	
	//método para extraer texto de una url
	public String getText(final String link) {
	String text = null;
	
	try {
		
		//Se crea un objeto URL
		URL url = new URL(link);
		
		// se adquieren los elmentos html de la URL
		Document document = Jsoup.parse(url, 5000);
		
		//se extrae el texto de dicho documento HTML
		text = document.text();
		
	} catch (MalformedURLException e) {
		
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	} catch (IOException e) {
		
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}
	return text;
	}
	
}
