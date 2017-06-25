import java.util.Scanner;

public class Exercicio13 {

	public static void main(String args[]){
		double not = 0;
		double m = medianot(not, 0);
		double med;
		med = m/10;
		System.out.println("A media é de: " + med);

	}

	static double medianot(double not, int i) {
		Scanner a = new Scanner(System.in);
		System.out.println("digite as notas: ");
		double nota = a.nextInt();
		not += nota;
		i++;
		if (i == 10) {
			return not;
		} else {
			return medianot(not, i);
		}

	}
}
