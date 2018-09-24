// This is a box class

class Box {
	double width;
	double height;
	double length;
}

// This is a BoxDemo2 class

class BoxDemo2 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		double vol1, vol2;

		// assign the value to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 10;
		mybox1.length = 10;

		// assign the values to mybox2's instance variables
		mybox2.width = 20;
		mybox2.height = 20;
		mybox2.length = 20;

		// compute the volume of mybox1
		vol1 = mybox1.width * mybox1.height * mybox1.length;
		System.out.println("The volume of mybox1 is "+vol1);

		// compute the volume of mybox2
		vol2 = mybox2.width * mybox2.length * mybox2.height;
		System.out.println("The volume of mybox2 is "+vol2);
	}
}