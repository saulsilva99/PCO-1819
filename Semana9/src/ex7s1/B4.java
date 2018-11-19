package ex7s1;

class B4 extends A {
	public B4() {
		super(0);
	}

	public B4(int v) {
		super(v);
	}

	public int getValue() {
		return super.get() + 1;
	}
}
