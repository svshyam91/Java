class Stack {
	int tos, size;
	int stck[];


	Stack( int size ) {
		this.size = size;
		stck = new int[size];
		tos = -1;
	}

	void push( int item ) {
		if( tos == size-1 )
			System.out.println("Stack Overflow");
		else 
			stck[++tos] = item;
	}

	int pop() {
		if( tos == -1 ) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}

class TestStack {
	public static void main(String[] args) {
		Stack ob1 = new Stack(10);
		Stack ob2 = new Stack(15);

		int i;

		// Pushing into both the arrays
		for( i = 0; i < 10; i++ )
			ob1.push(i);
		for( i = 0; i < 8; i++ )
			ob2.push(i);

		// Popping from both the arrays
		System.out.println("Stack 1:");
		for( i = 0; i < 10; i++ )
			System.out.println(ob1.pop());

		System.out.println("Stack 2:");
		for( i = 0; i < 8; i++ )
			System.out.println(ob2.pop());
	}
}