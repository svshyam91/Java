/* This program illustrates use of Super */

class A {
	int i;
}

class B extends A {
	int i; 		// this i hides i in A

	B(int a, int b) {
		super.i = a;		// i in A
		i = b;		// i in B
	}

	void show() {
		System.out.println("i in superclass = "+super.i);
		System.out.println("i in subclass = "+i);
	}
}

class UseSuper {
	public static void main(String[] args) {
		B ob = new B(2, 3);
		ob.show();
	}
}