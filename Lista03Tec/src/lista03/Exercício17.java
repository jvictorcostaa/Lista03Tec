package lista03;

import java.util.Scanner;

public class Exercício17 {
	public static char[] inverterstring(String stringnormal) {
		char invertida[] = stringnormal.toCharArray();
		char normal[] = stringnormal.toCharArray();
		for(int perc1 = 0,perc2 = stringnormal.length()-1;perc1<stringnormal.length();perc1++) {
			invertida[perc1] = normal[perc2];
			perc2--;
		}
			return(invertida);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		String nome = sacanner.next();
		System.out.println(inverterstring(nome));
		sacanner.close();
	}

}
