public class Exercicio07 {
	
	private static int i = 1;

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