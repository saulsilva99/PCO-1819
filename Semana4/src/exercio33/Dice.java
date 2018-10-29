	package exercio33;
	import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;
	
	public class Dice {
		private Random randomNumber;
	
		Dice(){
			// face = 0; como estava...
			randomNumber = new Random(); // agora
		}
	
		public int roll() {
			// Random randomNumber = new Random(); como estava 
			// return face = randomNumber.nextInt(10); como estava
			return randomNumber.nextInt(6); // agora
		}
		public void rollCata() { // void para porque não retorna nada
			int dado = 0;
			Random randomNumber = new Random();
			for (int i = 0; i < 20; i++) {
				dado = randomNumber.nextInt(7);
				System.out.println(dado); // Imprime o aleatorio
			}
			System.out.println(dado); // Este repete o ultimo que tinhas
			
			// Ficaria parecido ao teu mas o prof não queria desta maneira
			
		}
		/*
		 * Objetivo é esta funcao retornar um numero
		 * aleatorio, mas não imprime na consola.
		 */
		public static int roll2() {
			Random randomNumber = new Random();
			return randomNumber.nextInt(7);
		}
		
		/*
		 * Esta função chama a int roll2() 20 vezes
		 * e imprime no ecrã.
		 * Void porque não precisamos de retornar nada.
		 */
		
		public void imprimeVinteVezes() { 
			for(int i = 0; i < 20; i++) {
				System.out.println(roll2());
			}
		}
		// Desta maneira fica muita mais simples

		

	
	
	
	}
