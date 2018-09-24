class Factorial {
	int fact( int n ) {
		if( n == 1 )
			return 1;
		return n*fact(n-1);
	}
}

class Recursion {
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		System.out.println("Factorial of 6 is "+fac.fact(6));
		System.out.println("Factorial of 5 is "+fac.fact(5));
	}
}