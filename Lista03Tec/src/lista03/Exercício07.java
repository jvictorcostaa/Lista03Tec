package lista03;

import java.util.Scanner;

public class Exercício07 {
	public static int vetordem(int vet[]) {
		int cont = 0;
		for(int perc = 0;perc<vet.length-1;perc++) {
			if(vet[perc]>vet[perc+1]) {
				cont++;
			}
		}
		return(cont);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		int vet[] = new int[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			vet[perc] = sacanner.nextInt();
		}
		if(vetordem(vet)==0){
			System.out.println("true");
		}
		sacanner.close();
	}

}
