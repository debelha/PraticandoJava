package praticando;

import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		
	/*Fazer um programa que l? um valor inteiro N e depois N n?meros inteiros.
      Ao final, mostra a soma dos N n?meros lidos
	 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
 		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
 		System.out.println(soma);
 		
		sc.close();

	}

}
