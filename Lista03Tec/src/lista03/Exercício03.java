package lista03;
import java.util.Scanner;
public class Exercício03 {
	public static double mediapond(double not[],double pes[]) {
		double soma = 0;
		double pesos = 0;
		for(int perc = 0;perc<not.length;perc++) {
			soma += (not[perc] * pes[perc]);
			pesos += pes[perc];
		}
		return(soma/pesos);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		double notas[] = new double[tamanho];
		double pesos[] = new double[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			System.out.println("Valor da Nota "+(perc+1)+":");
			notas[perc] = sacanner.nextInt();
			System.out.println("Peso da Nota "+(perc+1)+":");
			pesos[perc] = sacanner.nextInt();
		}
		System.out.println(mediapond(notas,pesos));
		sacanner.close();
	}

}
