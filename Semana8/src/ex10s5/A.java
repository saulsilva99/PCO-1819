package ex10s5;

public class A {
	public int v = 0;

	public A() {
		v += 3;
	}

	public A(int i) {
		v = i;
	}

	public int value() {
		return v;
	}
}
