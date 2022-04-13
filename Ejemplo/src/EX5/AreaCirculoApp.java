package EX5;
import javax.swing.JOptionPane;
public class AreaCirculoApp {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce un radio");      
        double radio=Double.parseDouble(texto);
        double area=Math.PI*Math.pow(radio, 2); 
        
        System.out.println("El area del circulo es "+area);
    }
}