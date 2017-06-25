import java.util.Scanner;

public class Exercicio11 {

	public static void main(String args[]) {
		Integer[][][] mat = new Integer[5][5][5];
		recebervalor(mat, 0, 0, 0);
		imprimat(mat, 0, 0, 0, 0);

	}

	private static void imprimat(Integer[][][] mat, int i, int j, int k, int l) {
		System.out.println("O " + l + "º = " + mat[i][j][k]);
		k++;
		l++;
		if (k == 5) {
			j++;
			k = 0;
		}
		if (j == 5) {
			i++;
			j = 0;
		}
		if (i < 5) {
			imprimat(mat, i, j, k, l);
		}
	}

	public static Integer[][][] recebervalor(Integer[][][] mat, int i, int j, int k) {
		Scanner a = new Scanner(System.in);
		System.out.println("Digite os numeros da sua matriz");
		mat[i][j][k] = a.nextInt();
		k++;
		if (k == 5) {
			j++;
			k = 0;
		}
		if (j == 5) {
			i++;
			j = 0;
		}
		if (i > 4) {
			return mat;
		}
		return recebervalor(mat, i, j, k);
	}
}
