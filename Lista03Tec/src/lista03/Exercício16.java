package lista03;
import java.util.Scanner;
public class Exercício16 {

	public static void dividirprimo(int ultnum){
		int divisores = 0;
		for(int divisor = 2;divisor < ultnum;divisor++) {
			if(ultnum%divisor == 0) {
				divisores++;
			}
		}
			if(divisores==0){
				System.out.println("O numero "+ultnum+" e primo");
			}else {
				System.out.println("O numero "+ultnum+" nao e primo");
			}
	}
	
	public static void main(String[] args) {
			Scanner sacanner = new Scanner(System.in);
			int numero = sacanner.nextInt();
			dividirprimo(numero);
			sacanner.close();
		}
}
			