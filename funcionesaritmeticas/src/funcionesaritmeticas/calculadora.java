package funcionesaritmeticas;

import javax.swing.JOptionPane;


public class calculadora 
{

	
	public static  void main(String[] args)
     {
     //variables   que reciben  los  valores ingresados por pantalla
	String numero1;
	String numero2;
	//variables que convietrten  el texto  en   numeros
	int concatena1;
	int concatena2;
	//variable  que realiza la operacion
	int suma;
	String i ="si";
	String d ="XD";
	
	
    	do{
	     numero1 = JOptionPane.showInputDialog("Ingrese el primer numero");
     	 numero2 = JOptionPane.showInputDialog("Ingrese el segundo  numero");
         concatena1 = Integer.parseInt(numero1);
          concatena2 = Integer.parseInt(numero2);
     
          suma = concatena1 + concatena2;
     
          JOptionPane.showMessageDialog(null, "La suma  es " + suma,"resultado",JOptionPane.PLAIN_MESSAGE);
          
          i = JOptionPane.showInputDialog("Desea realizar otra  suma ");
<<<<<<< HEAD
          System.out.println(i);
          } while(i.equalsIgnoreCase("si"));
    	if( i.equalsIgnoreCase("no"))
=======
          
          }while( i == "si");
    	if( i == "no")
>>>>>>> 7c2a9cf8ae629c4505ddf38f78135f013252e21b
    	  {
    		JOptionPane.showMessageDialog(null, "Gracias por usar  el programa XD" );
    	  }
      }
}