package xml;

import java.io.Serializable;

public class Pelicula implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7085119132393239930L;
	private String titulo;
	private int anoRodaje;
	private String duracion;
	private String actor;
	
	public Pelicula(String titulo,int anoRodaje,String duracion,String actor) {
			this.titulo = titulo;
			this.anoRodaje = anoRodaje;
			this.duracion = duracion;
			this.actor = actor;
		}
		
		public String getTitulo() {
			return titulo;
		}
		
		public int getAñoRodaje() {
			return anoRodaje;
		}
		
		public String getDuracion() {
			return duracion;
		}
		
		public String getActor() {
			return actor;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public void setAñoRodaje(int anoRodaje) {
			this.anoRodaje = anoRodaje;
		}
		
		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}
		
		public void setActor(String actor) {
			this.actor = actor;
		}
		
		@Override
		public String toString() {
			String cadena;
			cadena = "Titulo: "+titulo+"\nAño de Rodaje: "+anoRodaje
			+"\nDuracion: "+duracion+"\nActor Principal: "+actor;
			
			return cadena;
		}
}
