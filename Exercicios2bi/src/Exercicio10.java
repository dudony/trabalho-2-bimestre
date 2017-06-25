import java.util.Scanner;

public class Exercicio10 {

	public static void main(String args[]) {
		Integer[][] mat = new Integer[5][5];
		recebervalor(mat, 0, 0);
		imprimat(mat, 0, 0, 0);

	}

	private static void imprimat(Integer[][] mat, int i, int j, int k) {
		System.out.println("O " + k + "º = " + mat[i][j]);
		j++;
		k++;
		if (j == 5) {
			i++;
			j = 0;
		}
		if (i < 5) {
			imprimat(mat, i, j, k);
		}
	}

	public static Integer[][] recebervalor(Integer[][] mat, int i, int j) {
		Scanner a = new Scanner(System.in);
		System.out.println("Digite os numeros da sua matriz");
		mat[i][j] = a.nextInt();
		j++;
		if (j == 5) {
			i++;
			j = 0;
		}
		if (i > 4) {
			return mat;
		}
		return recebervalor(mat, i, j);
	}
	
}
