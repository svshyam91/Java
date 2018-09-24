class Outer {
	int outer_x = 100;

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	class Inner {
		void display() {
			System.out.println("outer_x = "+outer_x);
		}
	}
}
class InnerClassDemo {
	public static void main(String[] args) {
		Inner inner = new Inner();
		// Outer outer = new Outer();
		inner.test();
	}
}