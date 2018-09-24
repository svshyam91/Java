class RecTest {
	int values[];

	RecTest( int i) {
		values = new int[i];
	}

	void PrintArray( int i ) {
		if( i == 0 )
			return;
		else
			PrintArray(i-1);
		System.out.println("["+(i-1)+"]"+values[i-1]);
	}
}

class Recursion2 {
	public static void main(String[] args) {
		int i;
		RecTest ob = new RecTest(10);
		for(i = 0; i < 10; i++ )
			ob.values[i] = i;
		ob.PrintArray(10);
	}
}