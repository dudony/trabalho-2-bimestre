import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String args[]){
		Scanner a = new Scanner(System.in);
		System.out.println("digite o valor:");
		int valor = a.nextInt();
		System.out.println("digite a taxa:");
		int taxa = a.nextInt();
		System.out.println("digite o periodo:");
		int n = a.nextInt();
		int j = 0;
		calcularjuros(valor, taxa, n, j);
		
	}

	private static void calcularjuros(int valor, int taxa, int n, int j) {
		if (n>=1) {
			j = valor*taxa*n;
			System.out.println(j);
			n--;
			calcularjuros(valor, taxa, n, j);
		}if(n==0){
			System.out.println(j);
		}
		
	}
}
