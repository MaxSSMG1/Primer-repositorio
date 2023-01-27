package arrays;

import java.util.Scanner;

public class ArrayIncremento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = {10,10,10,10,10,10,10,10,10,10};
		for (double i : numeros) {
			double porcentaje = sc.nextDouble();
			System.out.println(i += i*porcentaje/100);
			System.out.println("Esta cambiado desde Git");
		}
		sc.close();
	}
}
