import java.util.Scanner;

public class Exercicio17 {

	public static void main(String args[]){
		Scanner a = new Scanner(System.in);
		System.out.println("digite um numero");
		int n1 = a.nextInt();
		System.out.println("digite o multiplicador");
		int n2 = a.nextInt();
		multnumeros(n1,n2, 0, 0);
		int j = 0;
		System.out.println(j);
	}

	static int multnumeros(int n1, int n2, int i, int j) {
		i= n1;
		if(n2 == 0){
			return 0;
		}if(n2 == 1){
			return i;
		}if(i>1){
			j += n2;
			multnumeros(n1, n2, i);
		}
		return j;
	}
}
