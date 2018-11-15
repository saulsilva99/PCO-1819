package ex10s1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class RunOperacoes {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		try {
			FileReader fr = new FileReader("inteiros.txt");
		}catch(FileNotFoundException f) {
			System.out.println("Ficheiros Não foi encontrado mpt");
		}
		Scanner sc = new Scanner(new BufferedReader(new FileReader("inteiros.txt")));
		int tamanho = lerTamanhoArray(sc);
		int[] inteiros = lerArrayInteiros(sc, tamanho);
		sc.close();
	}

	public static int lerTamanhoArray(Scanner sc) throws Exception {
		//verficar se é assim
		//if(!sc.hasNextInt()) {
			//throw new Exception();
		//}
		String value = sc.nextLine();
		try {
			Integer.parseInt(value);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		int n = Integer.parseInt(value);
		return n;
		
	}

	/**
	 * @throws Exception 
	 * @requires tamanho>0
	 */
	public static int[] lerArrayInteiros(Scanner sc, int tamanho) throws Exception {
		
		// se for menor o tamanho o programa corre na mesma.
		String linha = sc.nextLine();
		String[] nrs = linha.split(" ");
		try {
			int[] inteiros = new int[nrs.length];
		}catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		int[] inteiros = new int[tamanho];

		for (int i = 0; i < nrs.length; i++) {
			try {
				Integer.parseInt(nrs[i]);
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			//int number = Integer.parseInt(nrs[i]);
			//if(number < 0) {
				//throw new Exception();
			//}
			//inteiros[i] = number;
			inteiros[i] = Integer.parseInt(nrs[i]);
		}

		//if(tamanho != nrs.length) {
			//throw new Exception();
		//}
		return inteiros;
	}
}