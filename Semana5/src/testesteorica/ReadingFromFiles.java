package testesteorica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ReadingFromFiles {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner readFile = new Scanner(new File("/home/saulsilva/Google Drive/Formações/FCUL/Faculdade 2018-2019/PCO/Semana5/ficheiro.txt"));
		String ficheiro  = readFile.nextLine();
		while(true) {
			System.out.println(readFile.nextLine());
		}
	}

}
