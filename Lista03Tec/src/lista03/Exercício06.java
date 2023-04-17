package lista03;

import java.util.Scanner;

public class Exercício06 {
	public static int[] ordemvet(int vetdesor[]) {
		int cont = 0;
		for(int perc = 1;perc<vetdesor.length;perc++) {
			if(vetdesor[perc-1]>vetdesor[perc]) {
				cont = vetdesor[perc-1];
				vetdesor[perc] = cont;
				vetdesor[perc-1] = vetdesor[perc];
			}
		}
		return(vetdesor);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		int vet[] = new int[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			vet[perc] = sacanner.nextInt();
		}
		int vetordem[] = ordemvet(vet);
		for(int perc = 0;perc<vetordem.length;perc++) {
			System.out.println(vetordem[perc]);
		}
		sacanner.close();
	}
}

