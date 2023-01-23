package arrays;

import java.util.Scanner;

public class ArrayMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float [] numeros = new float[10];
		
		for(int num=0; num< numeros.length; num++) {
			numeros[num] = sc.nextFloat();
		}
		
		float suma = 0;
		
		for (int i=0;i<numeros.length;i++){
			suma += numeros[i];
		}
		
		System.out.println(suma/10);
		sc.close();
	}

}
