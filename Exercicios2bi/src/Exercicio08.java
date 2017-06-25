public class Exercicio08 {

	private static int i = 100;

	public static void main (String args[]){
		numeropar();
	}

	private static void numeropar() {
		System.out.println(i);
		i -= 2;
		if (i>=0) {
			numeropar();
		}
	}
}
