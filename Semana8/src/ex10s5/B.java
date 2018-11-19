package ex10s5;

public class B extends A {
	public B() {
		v += 2;
	}

	public B(int i) {
		this();
		v -= i;
	}

	public B(int i, int j) {
		super(i);
		v *= j;
	}
}
