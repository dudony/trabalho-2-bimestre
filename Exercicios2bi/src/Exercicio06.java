public class Exercicio06 {

	private static int i = 0;

	public static void main (String args[]){
		numeropar();
	}

	private static void numeropar() {
		System.out.println(i);
		i += 2;
		if (i<=100) {
			numeropar();
		}
	}
}
