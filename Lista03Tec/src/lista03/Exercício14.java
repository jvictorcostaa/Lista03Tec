package lista03;

import java.util.Scanner;

public class Exercício14 {
	public static int[] excluirnum(int vet[],int num) {
		int tamvet = 0;
		for(int perc = 0;perc<vet.length;perc++) {
			if(vet[perc] != num) {
				tamvet++;
			}
		}
		int vetnovo[] = new int[tamvet];
		for(int perc = 0;perc<vet.length;perc++) {
			if(vet[perc] != num) {
				vetnovo[perc] = vet[perc];
			}
		}
		return(vetnovo);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		int vet[] = new int[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			vet[perc] = sacanner.nextInt();

		}
		int num = sacanner.nextInt();
		int vetnovo[] = excluirnum(vet,num);
		for (int perc = 0; perc < vetnovo.length; perc++) {
				System.out.print(vetnovo[perc]);
			}
		}
	}
