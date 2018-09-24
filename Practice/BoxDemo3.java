// Creating the Box class 
class Box {
	double length;
	double width;
	double height;

	void vol() {
		System.out.println("The volume of the box is: ");
		System.out.println( length * width * height );
	}
}

// Creating the BoxDemo3 class
class BoxDemo3 {
	public static void main(String[] args) {
		// this line creates two variables(references) of type Box (class data type)
		Box b1, b2;

		// these lines creates object to the class Box and 
		// assigns them to corresponding references 
		b1 = new Box();
		b2 = new Box();

		// assign the values to b1's instance variables
		b1.length = 3;
		b1.width = 4;
		b1.height = 5;

		// assign the values to b2's instance variables
		b2.length = 2;
		b2.width = 2;
		b2.height = 2;

		// display volume of b1 instance
		b1.vol();

		// display volume of b2 instance
		b2.vol();	
	}
}