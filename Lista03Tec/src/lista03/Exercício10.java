package lista03;

import java.util.Scanner;

public class Exercício10 {
	public static void vetiguais(int vet1[],int vet2[]) {
		int cont = 0;
		for(int perc =0;perc<vet1.length;perc++) {
			if(vet1[perc]!=vet2[perc]) {
				cont++;
			}
		}
		if(cont>0){
			System.out.println("os vetores nao sao iguais");
		}else {
			System.out.println("os vetores sao iguais");
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
		vetiguais(vet1,vet2);
		sacanner.close();
	}

}
