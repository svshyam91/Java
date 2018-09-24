class Stack {
	private int stck[] = new int[10];
	private int tos;

	// Initialize top-of-stack
	Stack() {
		tos = -1;
	} 

	// Push an element into the stack 
	void push( int item ) {
		if( tos == 9 )
			System.out.println("Stack Overflow");
		else
			stck[++tos] = item; 
	}

	// Pop an element from the stack 
	int pop() {
		if( tos == -1 ) {
			System.out.println("Stack Underflow");
			return 0;
		}

		else
			return stck[tos--];
	}
}

class StackMod {
	public static void main(String[] args) {

		int i;
		Stack st = new Stack();

		// Pushing into the stack
		for( i = 10; i < 20; i++ )
			st.push(i);

		// Poping from the stack
		System.out.println("Popping from the stack");
		for( i = 0; i < 10; i++ )
			System.out.println(st.pop());

	}
}