public class Exercicio01 {

	public static void main(String args[]) {
		contador(0);
	}

	static int contador(int a) {
		System.out.println(a);
		a++;
		if (a <= 100) {
			return contador(a);
		}
		return a;
	}

}
