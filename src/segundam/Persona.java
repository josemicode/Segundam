package segundam;

import java.util.Random;

public class Persona {
	
	
											//ATRIBUTES
	
	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	
											//CONSTRUCTORS
	
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona() {
		this.edad = 0;
		this.DNI = "";
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	
													//METHODS
	
	
	public boolean mayorEdad(int edad) {
		boolean bool = false;
		if(edad>=18) {
			bool=true;
		}
		return bool;
	}
	
	public String dniGenerator() {
		String newDNI = "";
		Random rd = new Random();
		String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i<=8; i++) {
			newDNI += (rd.nextInt(10));
		}
		newDNI += abecedario.charAt(rd.nextInt(26));
		
		return newDNI;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	public boolean equals(Persona p2) {
		boolean bool = false;
		
		if(this.DNI.equals(p2.DNI)) {
			bool = true;
		}
		
		return bool;
	}

	public int calcularIMC() {
		int res = 0;
		double IMC = (this.peso/(Math.pow(this.altura, 2)));
		
		if(IMC<20) {
			res--;
		}else if(IMC>25){
			res++;
		}
		
		return res;
	}

	public void ckSex() {
		if((this.sexo!='H')&&(this.sexo!='M')) {
			this.setSexo('H');
		}
	}
	
											//GETTERS Y SETTERS
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
