package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numeros= new int [10];
		
		for (int i=0;i<numeros.length;i++) {
			numeros[i] = sc.nextInt();
		}
		
		Arrays.sort(numeros);
		
		for(int num=0;num<numeros.length;num++) {
			if(num!=9)
				if(numeros[num] == numeros[num+1]) {
				System.out.println(numeros[num]+" esta duplicado");
				break;
				}
		}
		sc.close();
	}
}


