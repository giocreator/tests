package funcionesaritmeticas;

import javax.swing.JOptionPane;


public class calculadora {

	
	public static  void main(String[] args)
     {
     
	String numero1;
	String numero2;
	
	int concatena1;
	int concatena2;
	int suma;
	numero1 = JOptionPane.showInputDialog("Ingrese el primer numero");
	numero2 = JOptionPane.showInputDialog("Ingrese el segundo  numero");
     concatena1 = Integer.parseInt(numero1);
     concatena2 = Integer.parseInt(numero2);
     
     suma = concatena1 + concatena2;
     
     JOptionPane.showMessageDialog(null, "La suma  es " + suma,"resultado",JOptionPane.PLAIN_MESSAGE);
     }
}