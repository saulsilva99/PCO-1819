package exercicio41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Palindrome {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFromFile = new Scanner(new File("src/exercicio41/o_meu_fich.txt"));
		int numStrings = 0;
		int palindromes = 0;
		while (inputFromFile.hasNext()) {
			String s = inputFromFile.next();
			numStrings +=1;
			if(isPalindrome(s)) {
				palindromes +=1;
			}
		}
		System.out.println("Strings = "+numStrings);
		System.out.println("Palindromes = "+palindromes);
		
	}

	public static boolean isPalindrome(String s) {
		return s.equals(wordReverse(s));
		
	}

	public static String wordReverse(String s) {
		StringBuilder word = new StringBuilder(s);
		return word.reverse().toString();
		/*for(int i = reversed.length(); i > 1; i--) {
			reversed.append(s.charAt(i));
		}
		System.out.println(s);*/
	}

}
