package EX5;

public class NumeroMayorApp {

	public static void main(String[] args) {
		int Número1 = 10;
		int Número2 = 50;
		
		if(Número1>=Número2) {
			
			if(Número1==Número2) {
				System.out.println("El número "+Número1+" y el número "+Número2+" son iguales");
			}else {
				System.out.println("El número "+Número1+" es mayor que " +Número2);
			}
		}else {	
			System.out.println("El número " +Número1+ " es menor que " +Número2);
			
				
		}
	}
}
