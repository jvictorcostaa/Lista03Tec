package lista03;

import java.util.Scanner;

public class Exercício19 {
	public static void checknumperfeito(int num) {
		int somaperfeita = 0;
		for(int divisor = 1;divisor<num;divisor++) {
			if(num%divisor==0) {
				somaperfeita += divisor;
			}
		}
		if(somaperfeita == num) {
			System.out.println(num+"->"+true);
		}
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int num = sacanner.nextInt();
		checknumperfeito(num);
		sacanner.close();
	}

}
