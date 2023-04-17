
import java.util.Scanner;


public class Exercício09 {

	public static int LowestVal(int vector[], int index) {
		int lowestVal=vector[0];
		
		for(int i=1; i<=index; i++) {
			if(vector[i]<lowestVal)
				lowestVal = vector[i];
		}
		
		return lowestVal;
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
		
		System.out.printf("\nO menor valor ate %d do vetor eh: %d.", inputIndex, LowestVal(vector, inputIndex));
		scan.close();
	}

}
