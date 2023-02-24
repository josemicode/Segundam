package segundam;

import java.util.Random;
import java.util.Scanner;

public class mainPersona {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre");
		String nombre1 = sc.next();
		System.out.println("Introduzca la edad");
		int edad1 = sc.nextInt();
		System.out.println("Introduzca el sexo");
		char sexo1 = sc.next().charAt(0);
		System.out.println("Introduzca el peso");
		double peso1 = sc.nextDouble();
		System.out.println("Introduzca la altura");
		double altura1 = sc.nextDouble();

		Persona person1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);
		
		person1.ckSex();
		
		System.out.println("Bien, ahora con la segunda persona:");
		
		System.out.println("Introduzca el nombre");
		String nombre2 = sc.next();
		System.out.println("Introduzca la edad");
		int edad2 = sc.nextInt();
		System.out.println("Introduzca el sexo");
		char sexo2 = sc.next().charAt(0);
		

		Persona person2 = new Persona(nombre2, edad2, sexo2);
		
		person2.ckSex();
		
		Persona person3 = new Persona();
		
		person3.setNombre("Lebron");
		person3.setPeso(113);
		person3.setAltura(206);
		person3.setEdad(37);
		person3.setDNI(person3.dniGenerator());
		
		person3.ckSex();
		
		switch(person1.calcularIMC()) {
		case 1:
			System.out.println(person1.getNombre() + " tiene sobrepeso");
			break;
		default:
			System.out.println(person1.getNombre() + " no tiene sobrepeso");
		}
		
		switch(person2.calcularIMC()) {
		case 1:
			System.out.println(person2.getNombre() + " tiene sobrepeso");
			break;
		default:
			System.out.println(person2.getNombre() + " no tiene sobrepeso");
		}
		
		switch(person3.calcularIMC()) {
		case 1:
			System.out.println(person3.getNombre() + " tiene sobrepeso");
			break;
		default:
			System.out.println(person3.getNombre() + " no tiene sobrepeso");
		}
		
		if(person1.mayorEdad(edad1)) {
			System.out.println(person1.getNombre() + " es mayor de edad");
		}else {
			System.out.println(person1.getNombre() + " es menor de edad");
		}
		
		if(person2.mayorEdad(edad2)) {
			System.out.println(person2.getNombre() + " es mayor de edad");
		}else {
			System.out.println(person2.getNombre() + "es menor de edad");
		}
		
		if(person3.mayorEdad(person3.getEdad())) {
			System.out.println(person3.getNombre() + " es mayor de edad");
		}else {
			System.out.println(person3.getNombre() + " es menor de edad");
		}
		
		
		//System.out.println("P1"+person1.getSexo()+"P2"+person2.getSexo()+"P3"+person3.getSexo());
		
	}

}
