import java.util.Scanner;

public class Exercicio20 {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("digite um numero para fazer o fatorial:");
		int fat = a.nextInt();
		System.out.println(fatorial(fat));
	}

	static int fatorial(int fat) {
		if (fat == 1 || fat == 0) {
			return 1;
		} else {
			return fat * fatorial(fat - 1);
		}
	}
}
