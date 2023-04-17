package lista03;
import java.util.Scanner;

public class Exercício05 {
	public static int[] copiarvet(int vetor[]) {
		int vetcopy[] = new int[vetor.length];
		for(int perc = 0;perc<vetcopy.length;perc++) {
			vetcopy[perc] = vetor[perc];
		}
		return(vetcopy);
	}
	public static void main(String[] args) {
		Scanner sacanner = new Scanner(System.in);
		int tamanho = sacanner.nextInt();
		int vet[] = new int[tamanho];
		for(int perc = 0;perc<tamanho;perc++) {
			vet[perc] = sacanner.nextInt();
		}
		int vetcopia[] = copiarvet(vet);
		System.out.println("O vetor copia e:");
		for (int perc = 0;perc<vetcopia.length;perc++) {
			System.out.print(vetcopia[perc]);
		}
		sacanner.close();
	}

}
