package exercicio41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Palindrome {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFromFile = new Scanner(new File("src/exercicio41/o_meu_fich.txt"));
		while(inputFromFile.hasNext()) {
			System.out.println(inputFromFile.next());
		}
		System.out.println("asdasdas");
		isPalindrome("abc");
	}
	public static boolean isPalindrome(String s) {
		String[] word = s.split("");
		String[] wordInverted = new String[word.length];
		for(int i = word.length-1; i > 0; i--) {
			wordInverted[i] = word[i];
			System.out.println(word);
			System.out.println(wordInverted.toString());
		}
		return true;
	}

}
