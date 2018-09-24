class Stack {

	int stck[] = new int[10];
	int tos;

	Stack() {
		tos = -1;
	}

	// Push an item onto the stack
	void push( int item ) {
		if( tos == 9 )
			System.out.println("Stack Overflow ");
		else
			stck[++tos] = item;
	}

	// Pop an item from the stack
	int pop() {
		if( tos < 0 ) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else
			return stck[tos--];
	}

}

class StackTest {

	public static void main(String[] args) {
		
		int i;

		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();

		// Pushing items on both the stacks
		for(i = 0; i < 10; i++)
			mystack1.push(i);
		for(i = 10; i < 20; i++)
			mystack2.push(i);

		// Poping items from stack 1
		System.out.println("Stack of mystack1");
		for(i = 0; i < 10; i++)
			System.out.println(mystack1.pop());

		// Poping items from stack 2
		System.out.println("Stack of mystack2");
		for(i = 0; i < 10; i++)
			System.out.println(mystack2.pop());
	}
}