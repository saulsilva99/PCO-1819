package ex7s2;

public class Main {

	public static void main(String[] args) {
		class Base {
			void callme() {
				System.out.println("Inside A's callme method");
			}
		}

		class SubClass extends Base {
			void callme() {
				System.out.println("Inside B's callme method");
			}
		}

		class SubClass2 extends Base {
			void callme() {
				System.out.println("Inside C's callme method");
			}
		}
		Base a = new Base();
		SubClass b = new SubClass();
		SubClass2 c = new SubClass2();
		Base r;
		r = a;
		r.callme();
		r = b;
		r.callme();
		r = c;
		r.callme();
	}

}
