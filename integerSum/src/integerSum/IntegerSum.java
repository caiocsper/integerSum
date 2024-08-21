package integerSum;

import java.util.*;

class IntegerSum {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		int sum = 0;
		
		for(int i = 0; i < 2; ++i) {
			System.out.println("Digite um número");
			sum += sc.nextInt();
		}
		
		System.out.println("Soma: " + sum);
	}
}
