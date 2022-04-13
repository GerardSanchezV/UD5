package EX6;
import javax.swing.JOptionPane;
public class NumApp {

	public static void main(String[] args) { 
	        String texto=JOptionPane.showInputDialog("Introduce el limite");
	        int limite=Integer.parseInt(texto);
	        texto=JOptionPane.showInputDialog("Introduce un numero");
	        int numero1=Integer.parseInt(texto);
	        texto=JOptionPane.showInputDialog("Introduce un numero");
	        int numero2=Integer.parseInt(texto);	        
	        for(int i=0;i<limite;i++){
	            System.out.println(generaNumero(numero1, numero2));
	        }
	    }
	   public static int generaNumero(int num1, int num2){
	        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
	    }
	
		

	}


