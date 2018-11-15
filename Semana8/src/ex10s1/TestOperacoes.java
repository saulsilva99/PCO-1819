package ex10s1;

public class TestOperacoes {

	public static void main(String[] args) {
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 8;
		a[2] = 2;
		a[3] = 5;
		
		Operacoes op = new Operacoes();
		System.out.println(op.totalMaiores(a, 4));
		System.out.println(op.soma(a, 4));
		System.out.println(op.media(a, 80));
	}

}
