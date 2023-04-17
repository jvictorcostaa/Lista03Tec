package lista03;
import java.util.Scanner;
public class Exercício02 {
	public static double mediavet(double med1[],double med2[]) {
		double media = 0;
		for(int perc = 0;perc<med1.length;perc++) {
			media += med1[perc]+med2[perc];
		}
			return(media/(med1.length*2));
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		double vet1[] = new double[tamanho];
		double vet2[] = new double[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			System.out.println("Número da posição: "+perc+" do vetor 1");
			vet1[perc] = sacanner.nextInt();
			System.out.println("Número da posição: "+perc+" do vetor 2");
			vet2[perc] = sacanner.nextInt();
		}
		System.out.println(mediavet(vet1,vet2));
		sacanner.close();
	}

}
