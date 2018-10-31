package exercicio43;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVFiles {
	public String[][] arrayBi = new String[100][100];

	public void leituraCSV() throws FileNotFoundException {
		int i = 0;
		Scanner inputFromFile = new Scanner(new File("src/exercicio43/ficheiroexcell.csv"));
		while (inputFromFile.hasNextLine()) {

			String linha = inputFromFile.nextLine();
			for (int j = 0; j < linha.split(",").length; j++) {
				String colunas = linha.split(",")[j];
				arrayBi[i][j] = colunas;
				// System.out.println("["+i+"]"+"["+j+"]"+arrayBi[i][j]);
			}
			i += 1;
		}
		inputFromFile.close();
	}
}
