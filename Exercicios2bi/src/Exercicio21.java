import java.util.Scanner;

public class Exercicio21 {

	public static void main(String args[]){
		Scanner a = new Scanner(System.in);
		System.out.println("digite o valor do triangulo");
		int tri = a.nextInt();
		calctri(tri);
		System.out.println(calctri(tri));
		
	}

	static int calctri(int tri) {
		if (tri == 1 ){
			return tri;
		}
		return tri + calctri(tri-1);
	}
}
