package arrays;
import java.text.DecimalFormat;
/**
 * Se utiliza un array para visualizar varios empleados
 * @author Max Sierra
 * @version 1.0 16/12/2022
 */
public class EmpleadoPrincipal {
	public static void main(String[] args) {
		//Creo cada empleado
		Empleado empleado1 = new Empleado("7","Michael","Jordan", 700);
		Empleado empleado2 = new Empleado("8","Ricky","Morty", 1000);
		Empleado empleado3 = new Empleado("9","Tommy","Jerry", 1200);
		Empleado empleado4 = new Empleado("10","Barack","Obama", 2000.1111f);
		
		//Los guardo en el array de empleados
		Empleado [] empleados = {empleado1, empleado2, empleado3, empleado4};
		
		//Patron para que el sueldo tengo dos decimales
		String patron = "0.00";
		DecimalFormat dosDigitos = new DecimalFormat(patron);
		
		//Bucle for each para visualizar el nombre y sueldo de cada empleado
		for (Empleado i: empleados) {
			i.setSueldo(i.getSueldo()+i.getSueldo()*5/100);
			System.out.println(i.getNombre()+" "+dosDigitos.format(i.getSueldo()));
		}
	}

}