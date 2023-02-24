package segundam;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class twointpara {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//valmorad valmo = new valmorad();
		
		//valmo.numerales();
		
		//Class clase1 = valmo.getClass();
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int estado = processOnJavaFunc2(noteloesperas.class, n1, n2);
		System.out.println("estado: "+ estado);
		//System.out.println("res: "+ noteloesperas.numerales(n1, n2));
	}
	
	public static int processOnJavaFunc2(Class classs, int p1, int p2) throws IOException, InterruptedException {
		
		String HomeJava = System.getProperty("java.home");
		String BinJava = (HomeJava +File.separator+ "bin" +File.separator+ "java");
		
		String classPath = System.getProperty("java.class.path");
		String className = classs.getCanonicalName();
		
		ProcessBuilder pb = new ProcessBuilder(BinJava, "-cp", classPath, className, String.valueOf(p1), String.valueOf(p2));
		Process launchFunc = pb.start();
		launchFunc.waitFor();
		//launchFunc.destroy();
		return launchFunc.exitValue();
	}

}
