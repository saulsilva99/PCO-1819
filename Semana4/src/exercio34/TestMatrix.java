package exercio34;

import java.security.Identity;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestMatrix {

	public static void main(String[] args) {
		Matrix m = new Matrix(3,3);
		m.set(0, 0, 1);
		m.set(0, 1, 2);
		m.set(1, 0, 3);
		m.set(1, 1, 4);
		m.set(2, 1, 0);
		m.set(2, 0, 1);

		m.imprimeMatrix(m);
		
		System.out.println("   ");
		m.transpose();


	}
}
