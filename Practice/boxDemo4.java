class Box {
	double width;
	double height;
	double length;

	double volume() {
		return (width*height*length);
	}
}

class BoxDemo4 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		// Assigning values to instance variables of mybox1
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.length = 30;

		// Getting volume of mybox1
		vol = mybox1.volume();

		System.out.println("Volume of mybox1 is "+vol);

		// Assigning values of instance variables of mybox2
		mybox2.width = 20;
		mybox2.height = 30;
		mybox2.length = 40;

		// Getting volume of mybox2
		vol = mybox2.volume();

		System.out.println("Volume of mybox2 is "+vol);


	}
}