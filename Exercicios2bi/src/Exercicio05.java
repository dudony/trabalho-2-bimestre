import java.util.Scanner;

public class Exercicio05 {

	public static void main(String args[]){
		int[] valor = new int[10];
		recebervalor(valor, 0);
		int maiorvalor = valor[1];
		System.out.println("O maior valor digitado foi: " + maiorvalor(valor, 0, maiorvalor));
	}

	static void recebervalor(int[] valor, int i) {
		Scanner v = new Scanner(System.in);
		System.out.println("digite os numeors");
		valor[i] = v.nextInt();
		i++;
		if(i < 10){
			recebervalor(valor, i);
		}
	}
	static int maiorvalor(int[] valor, int i, int v){
		if (v < valor[i]){
			v = valor[i];
			i++;

		}if(i<10){
			return v;
		}

		return maiorvalor(valor, i, v);
	}
}

