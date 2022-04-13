package EX5;

import javax.swing.JOptionPane;
public class ProductoivaApp {
 
    public static void main(String[] args) {     
        final double IVA=0.21;
 
        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
                double precio=Double.parseDouble(texto); 
                double precioFinal=precio+(precio*IVA);
 
        System.out.println(precioFinal);
    }
}