package arrays;
import java.util.Scanner;
public class ArrayNombres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nombres = new String[10];
		System.out.println("Introduzca 10 nombres");
		
		for (int i = 0; i< nombres.length; i++) {
		System.out.println("Introduzca nombre, numero "+(i+1)+" de 10");
		nombres[i] = sc.next();
		}
		
		for(String numero: nombres) {
			System.out.println(numero);
		}
		sc.close();
	}

}
