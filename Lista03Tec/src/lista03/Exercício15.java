package lista03;
import java.util.Scanner;
public class Exercício15 {
	public static void checkpalindromo(String palindromo) {
		int cont = 0;
		for(int perc = 0,percinversa = palindromo.length()-1;perc<palindromo.length();perc++) {
			if(palindromo.charAt(perc) != palindromo.charAt(percinversa)) {
				cont++;
			}
			percinversa--;
		}
		if(cont==0) {
			System.out.println(palindromo+"->"+true);
		}
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		String nome = sacanner.next();
		checkpalindromo(nome);
		sacanner.close();
	}

}
