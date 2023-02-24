package segundam;

public class gestionact1 {

	public static void main(String[] args) {

		String ruta = ("C:\\Program Files (x86)\\Microsoft\\Edge\\Application");
		
		ProcessBuilder pb = new ProcessBuilder(ruta);
		try{
			
			Process proceso = pb.start();
			
			
		}catch(Exception ex) {
			System.out.println("Error: " + ex.toString());
		}
		
	}

}
