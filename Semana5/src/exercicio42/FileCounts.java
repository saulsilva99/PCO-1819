package exercicio42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCounts {
	private static int linhas;
	private static int palavras;
	private static int caracteres;

	public void leituraFile() throws FileNotFoundException {
		Scanner inputFromFile = new Scanner(new File("src/exercicio41/o_meu_fich.txt"));	
		while(inputFromFile.hasNextLine()) {
			StringBuilder s = new StringBuilder(inputFromFile.nextLine());
			String[] words = s.toString().split(" ");
			String[] caracterLinhas = s.toString().split("");
			
			for(int i = 0; i < words.length; i++){
					palavras +=i;
			}
			for(int j = 0; j < caracterLinhas.length; j++) {
				caracteres +=1;
			}
			linhas+=1;
		}
		
		System.out.println(linhas+" linhas");
		System.out.println(palavras+" palavras");
		System.out.println(caracteres+" caracters");
		
		inputFromFile.close();
	}
	
	public int sizeOfWord(String s) {
		
		return 0;
	}
	
}
