import java.util.Scanner;

public class Exercicio03 {

	public static void main (String args[]){
		int[] arr = new int[10];
		System.out.println("A soma de seus numeros: " + somarvalor(arr, 0,0));
	}

	 static int somarvalor(int[] arr, int i, int j) {
		if(i == 10){
			return j;
		}
		Scanner n = new Scanner(System.in);
		System.out.println("digite um numero ");
		arr[i] = n.nextInt();
		j += arr[i];
		return somarvalor(arr, ++i, j);
	}
}
