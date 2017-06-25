import java.util.Scanner;

public class Exercicio04 {

	public static void main(String args[]){
		int[] valor = new int[10];
		recebervalor(valor, 0);
		int menorvalor = valor[1];
		System.out.println("O menor valor digitado foi: " + menorvalor(valor, 0, valor, menorvalor));
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
	 static int menorvalor(int[] valor, int i, int[] v, int j){
		if (valor[i] < v[j]){
			v[j] = valor[i];
			i++;
			j++;
		}else if(i<10 || j<10){
			return menorvalor(valor, i, v, j);
		}
		 return v[j];
		 
	 }
}
