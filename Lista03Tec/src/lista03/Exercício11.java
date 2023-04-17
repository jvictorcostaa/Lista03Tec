package lista03;
import java.util.Scanner;
public class Exercício11 {
	public static int potenciaçao(int base,int expoente) {
		int potencia = 0;
		for(int cont = 1;cont<expoente;cont++) {
			if(cont == 1) {
				potencia = base * base;
			}else {
				potencia = potencia*base;
			}
		}
		return(potencia);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int base = sacanner.nextInt();
		int expoente = sacanner.nextInt();
		System.out.println(potenciaçao(base,expoente));
		sacanner.close();
	}
	
}
