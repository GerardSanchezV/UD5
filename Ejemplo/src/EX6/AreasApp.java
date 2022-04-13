package EX6;

import javax.swing.JOptionPane;
public class AreasApp {
    public static void main(String[] args) {      
        String texto="";       
        double resultado=0;
        String eleccion=JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado");
        switch (eleccion){        
        case "circulo":
            texto=JOptionPane.showInputDialog("Introduce el radio");
            int radio=Integer.parseInt(texto);
            resultado=areaCirculo(radio);
            break;
        case "triangulo":
            texto=JOptionPane.showInputDialog("Introduce la base");
            int base=Integer.parseInt(texto);
            texto=JOptionPane.showInputDialog("Introduce la altura");
            int altura=Integer.parseInt(texto);
            resultado=areaTriangulo(base, altura);
            break;
        case "cuadrado":
            texto=JOptionPane.showInputDialog("Introduce la medida de un lado");
            int lado=Integer.parseInt(texto);
            resultado=areaCuadrado(lado);
            break;
        default:
            System.out.println("No has introducido una figura correcta");
        }
        System.out.println("El area del "+eleccion+" es "+resultado);
   }
   public static double areaCirculo (int radio){
        return Math.pow(radio, 2)*Math.PI;
    }
   public static double areaTriangulo (int base, int altura){
        return base*altura/2;
    }
   public static double areaCuadrado (int lado){
        return lado*lado;
    }
}