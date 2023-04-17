package lista03;
import java.util.Scanner;

public class Exercício04 {
	public static int procurarnum(double vet1[],double vet2[],int numero) {
		int contnum = 0;
		for(int perc = 0;perc<vet1.length;perc++) {
			if(vet1[perc] == numero) {
				contnum++;
			}
			if(vet2[perc] == numero) {
				contnum++;
			}
		}
		return(contnum);
	}	
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		double vet1[] = new double[tamanho];
		double vet2[] = new double[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			vet1[perc] = sacanner.nextInt();
			vet2[perc] = sacanner.nextInt();
		}
		int num = sacanner.nextInt();
		System.out.println(num+"->"+procurarnum(vet1,vet2,num));
		sacanner.close();
	}

}
