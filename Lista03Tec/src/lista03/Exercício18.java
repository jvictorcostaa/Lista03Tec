package lista03;
import java.util.Scanner;
public class Exercício18 {
	public static double juroscompostos(double c,double i,int t){
		double montante = c*(Math.pow(i+1, t));
		return(montante);
	} 
	public static void main(String[] args) {
		
		Scanner sacanner = new Scanner(System.in);
		double valorinicial = sacanner.nextDouble();
		double juros = sacanner.nextDouble();
		int periodo = sacanner.nextInt();
		System.out.println(juroscompostos(valorinicial,juros,periodo));
		sacanner.close();
	}

}
