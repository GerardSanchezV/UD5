package EX5;
import java.util.Scanner;
public class MitadApp {
		public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce un numero");
	int numero=sc.nextInt();
	
	if (numero%2==0) {
		System.out.println("El numero "+numero+" es divisible entre 2");
	}else {
		System.out.println("El numero "+numero+" no es divisible entre 2");
		}	
	}
}
