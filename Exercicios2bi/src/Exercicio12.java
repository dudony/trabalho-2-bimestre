import java.util.Scanner;

public class Exercicio12 {

	public static void main(String args[]){
		Scanner a = new Scanner(System.in);
		System.out.println("Digite um numero para fazer a tabuada ");
		int n = a.nextInt();
		tabuada(n, 0);
		
	}

	private static void tabuada(int n, int i) {
		int tab = n * i;
		System.out.println("A tabuada do " + n + "x" + i + "= " + tab);
		i++;
		if (i <= 10) {
			tabuada(n, i);
		}
	}
}
