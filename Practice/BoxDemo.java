// This is a box class

class Box {
	double width;
	double height;
	double length;
}

// This is a BoxDemo class

class BoxDemo {
	public static void main(String[] args) {
		Box mybox = new Box();
		double vol;

		// assign values to mybox's instance variables
		mybox.width = 50.0;
		mybox.height = 10.0;
		mybox.length = 5.0;

		// compute the volume of the box
		vol = mybox.width*mybox.height*mybox.length;
		System.out.println("Volume is: "+vol);
	}
} 

