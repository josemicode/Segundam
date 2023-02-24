package xml;

import java.io.File;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class abrir_dom_desde_java {
	
	public static void main(String[] args) {
		abrir_XML_DOM(new File("libro.xml"));
		//recorreryMostrar();s
	}

	public static int abrir_XML_DOM(File fichero) {

		Object doc = null; // doc es de tipo Document y representa al árbol DOM

		try {
			// Se crea un objeto DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			// Indica que el modelo DOM no debe contemplar los comentarios que tenga el XML
			factory.setIgnoringComments(true);

			// Ignora los espacios en blanco que tenga el documento
			factory.setIgnoringElementContentWhitespace(true);

			// Se crea un objeto DocumentBuilder para cargar en él la estructura del árbol
			// DOM a partir del XML seleccionado
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Interpreta (parsea) el documento XML (file) y genera el DOM equivalente
			doc = builder.parse(fichero);

			// Ahora doc apunta al árbol DOM listo para ser recorrido
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	public String recorrerDOMyMostrar(Document doc) {

		String datos_nodo[] = null;
		String salida = "";
		Node node;

		// Obtiene el primer nodo del DOM (primer hijo)
		Node raiz = ((Node) doc).getFirstChild();

		// Obtiene una lsita de nodos con todos los nodos hijo del raíz
		NodeList nodeList = raiz.getChildNodes();

		// Procesa los nodos hijo
		for (int i = 0; i < nodeList.getLength(); i++) {
			node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				// Es un nodo libro
				datos_nodo = procesarLibro(node);
				salida = salida + "\n " + "Publicado en: " + datos_nodo[0];
				salida = salida + "\n " + "El autor es: " + datos_nodo[2];
				salida = salida + "\n " + "El título es: " + datos_nodo[1];
				salida = salida + "\n --------------------";
			}
		}
		return salida;
	}

	protected String[] procesarLibro(Node n) {

		String datos[] = new String[3];
		Node ntemp = null;
		int contador = 1;

		// Obtiene el valor del primer atributo del nodo (solo uno en este ejemplo)
		datos[0] = n.getAttributes().item(0).getNodeValue();

		// Obtiene los hijos del Libro (título y autor)
		NodeList nodos = n.getChildNodes();
		for (int i = 0; i < nodos.getLength(); i++) {
			ntemp = nodos.item(i);
			if (ntemp.getNodeType() == Node.ELEMENT_NODE) {
				/*
				 * Importante: para obtener el texto con el título y autor se accede al nodo
				 * TEXT hijo de ntemp y se saca su valor
				 */
				datos[contador] = ntemp.getChildNodes().item(0).getNodeValue();
				contador++;
			}
		}
		return datos;
	}

}