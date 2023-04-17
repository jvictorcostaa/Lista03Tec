package lista03;

import java.util.Scanner;

public class Exercício13 {
	public static void interseccao(int vet1[],int vet2[]) {
		int vetrep[] = new int[vet1.length];
		for(int perc = 0;perc<vet1.length;perc++) {
			for(int perc2 = 0;perc2<vet2.length;perc2++) {
				if(vet1[perc] == vet2[perc2]) {
					vetrep[perc] = vet1[perc];
					System.out.print(vetrep[perc]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		int vet1[] = new int[tamanho];
		int vet2[] = new int[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			System.out.println("Número da posição: "+perc+" do vetor 1");
			vet1[perc] = sacanner.nextInt();
			System.out.println("Número da posição: "+perc+" do vetor 2");
			vet2[perc] = sacanner.nextInt();
		}
		interseccao(vet1,vet2);

	}

}
