import java.util.Scanner;

public class Exercicio14 {

	public static void main(String args[]) {
		int fal = 0;
		int m = mediafal(fal, 0);
		int med;
		med = m/10;
		System.out.println("A media é de: " + med);

	}

	static int mediafal(int fal, int i) {
		Scanner a = new Scanner(System.in);
		System.out.println("digite as faltas: ");
		int faltas = a.nextInt();
		fal += faltas;
		i++;
		if (i == 10) {
			return fal;
		} else {
			return mediafal(fal, i);
		}

	}
}
