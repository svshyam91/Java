class Box {
	double width;
	double height;
	double length;

	Box() {
		System.out.println("Constructing Box");
		width = 10.0;
		height = 10.0;
		length = 10.0;
	}

	double volume() {
		return width*height*length;
	}

}
class BoxDemo6 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		double vol;

		// Getting volume of mybox1
		vol = mybox1.volume();

		System.out.println("Volume of mybox1 is "+vol);

		// Getting volume of mybox2
		vol = mybox2.volume();

		System.out.println("Volume of mybox2 is "+vol);
	}

}