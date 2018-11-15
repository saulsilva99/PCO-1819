package ex10s1;

public class Operacoes {

	public int totalMaiores(int[] inteiros, int n) {
		int max = inteiros.length;
		int soma=0;
		for(int i = 0; i < max; i++) {
			if(inteiros[i] > n) {
				soma+=1;
			}
			
		}
		return soma;
	}
	int soma(int[] inteiros, int n) {
		int max = inteiros.length;
		int soma=0;
		double media=0;
		for(int i = 0; i < max; i++) {
			if(inteiros[i] > n) {
				soma+=inteiros[i];
			}
		}
		return soma;
	}
	double media(int[] inteiros, int n) {
		int max = inteiros.length;
		int soma=0;
		int contados=0;
		double media=0;
		for(int i = 0; i < max; i++) {
			if(inteiros[i] > n) {
				soma+=inteiros[i];
				contados+=1;
				try {
					media = soma/contados;
					
				}catch(ArithmeticException e) {
					return 0;
				}
			}
		}
		return media;
	}
}
