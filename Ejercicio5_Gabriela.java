//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5_Gabriela {
    public static void main(String[] args) {
       // Scanner a=new Scanner(System.in);
        
        short R=0, H=0, volumen, area;
         R=Short.parseShort(JOptionPane.showInputDialog("Digite el valor del Radio:"));
        //System.out.print("Digite el valor del Radio: ");
        //R=a.nextShort();
        
         H=Short.parseShort(JOptionPane.showInputDialog("Digite el valor de la Altura:"));
        //System.out.println("Digite el valor de la Altura: ");
       // H=a.nextShort();
        
        area=(short) (Math.PI * Math.pow(R, 2));
        
        JOptionPane.showMessageDialog(null,"El area del cilindro es: " + area + ".");
        //System.out.print("El area del cilindro es: " + area + ". ");
        
       System.out.println();
        
         volumen= (short)( area * H);
         JOptionPane.showMessageDialog(null,"El volumen del cilindro es: " + volumen +". ");
        // System.out.print("El volumen del cilindro es: " + volumen +". ");
             
                }
}
