class Box {
	double width = 3;
	double height = 4;
	double depth = 5;

	// Constructor to Box class
	Box( double w, double h, double d) {

		System.out.println("Constructing the Box class.");

		width = w;
		height = h;
		depth = d;
	}

	// Function to calculate volume of Box
	double volume() {
		return width*height*depth;
	}

}
class BoxDemo7 {
	public static void main(String[] args) {

		Box mybox1 = new Box(10, 10, 10);
		Box mybox2 = new Box(20, 20, 20);

		double vol;
		vol = mybox1.volume();

		System.out.println("The volume of Box 1: "+vol);

		vol = mybox2.volume();

		System.out.println("The volume of Box 2:"+vol);
	}
}