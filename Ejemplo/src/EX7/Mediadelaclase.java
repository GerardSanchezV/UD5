package EX7;

import java.util.Scanner;

public class Mediadelaclase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numAlum, i;
		double suma =0, media;
		
		do {
			System.out.println("Número de alumnos");
			numAlum = sc.nextInt();
		
		}while (numAlum <= 0);
		
		double[] notas= new double[numAlum];
		for (i=0; i< notas.length; i++) {
			System.out.println("Alumno " + (i + 1) + " Nota final:");
			notas[i]=sc.nextDouble();
			
		}
		for (i=0; i< notas.length; i++) {
			suma = suma + notas[i];
		}
		media = suma / notas.length;
		System.out.printf("Nota media del curso %.2f %n", media);
		
	
	}

}
