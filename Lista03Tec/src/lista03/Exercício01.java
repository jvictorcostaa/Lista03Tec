package lista03;
import java.util.Scanner;
public class Exercício01 {
	public static int somavetor(int soma[]) {
		int somatorio = 0;
		for(int perc = 0;perc<soma.length;perc++) {
			if(perc == 0 || perc == 1|| perc == soma.length-1||perc == soma.length-2) {
			}else {
				somatorio+=soma[perc]; 
			}
		}
		return(somatorio);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int vet[] = new int[sacanner.nextInt()];
		for(int perc = 0;perc<vet.length;perc++) {
			vet[perc] = sacanner.nextInt();
		}
		System.out.println(somavetor(vet));
		sacanner.close();
	}

}
