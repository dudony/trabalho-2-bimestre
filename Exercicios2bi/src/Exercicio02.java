public class Exercicio02 {
	
	public static void main(String args[]){
		contador(100);
	}

	static int contador(int a){
		System.out.println(a);
		a--;
		if(a >= 0){
			return contador(a);
		}
		return a;
	}
}
