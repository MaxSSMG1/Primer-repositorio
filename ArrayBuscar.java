package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuscar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("RAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		String [] cadenas= {"Hola","Adios","Chaval","Vamos","A","Casa"};
		Arrays.sort(cadenas);
		String loDicho= sc.next();
		if(Arrays.binarySearch(cadenas, loDicho)>-1)
		System.out.println("Posicion en la que se encuentra "+loDicho+": "+Arrays.binarySearch(cadenas, loDicho));
		else
		System.out.println("No esta");
		sc.close();
	}

}
