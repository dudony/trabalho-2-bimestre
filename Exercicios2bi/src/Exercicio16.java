import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String args[]){
		String[] n = new String[10];
		peganome(n,0);
		impnomme(n,0);
		
	}

	private static void impnomme(String[] n, int i) {
		System.out.println(n[i]);
		i++;
		if(i<10){
			impnomme(n, i);
		}
	}

	private static void peganome(String[] n, int i) {
		Scanner a = new Scanner(System.in);
		System.out.println("Digite os nomes");
		n[i] = a.nextLine();
		i++;
		if(i<10){
			peganome(n, i);
		}
		a.close();
	}
}
