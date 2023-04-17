package lista03;
import java.util.Scanner;

public class Exercício08 {

	public static int BiggestVal(int vector[], int index) {
		int biggestVal=0;
		
		for(int i=0; i<=index; i++) {
			if(vector[i]>biggestVal)
				biggestVal = vector[i];
		}
		return biggestVal;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeVector;
		int inputIndex;
		
		sizeVector = Integer.parseInt(scan.nextLine());
		
		int vector[] = new int[sizeVector];
		
		for(int i=0; i<sizeVector; i++) {
			vector[i] = Integer.parseInt(scan.nextLine());
		}
		inputIndex = Integer.parseInt(scan.nextLine());
		System.out.printf("\nO maior valor %d do vetor eh: %d", inputIndex, BiggestVal(vector, inputIndex));

		scan.close();
	}

}