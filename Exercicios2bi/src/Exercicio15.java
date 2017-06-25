import java.util.Scanner;

public class Exercicio15 {

	public static void main(String args[]){
		int ida = 0;
		int m = mediaida(ida, 0);
		int med;
		med = m/10;
		System.out.println("A media é de: " + med);

	}

	static int mediaida(int ida, int i) {
		Scanner a = new Scanner(System.in);
		System.out.println("digite as idades: ");
		int idade = a.nextInt();
		ida += idade;
		i++;
		if (i == 10) {
			return ida;
		} else {
			return mediaida(ida, i);
		}

	}
}
