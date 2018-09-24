class Box {

	double width;
	double height;
	double depth;

	Box( double width, double height, double depth ) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width*height*depth;
	}
}

class Instance_Variable_Hiding {
	
	public static void main(String[] args) {

		Box mybox1 = new Box(10, 20, 30);
		Box mybox2 = new Box(20, 30, 40);

		double vol;
		vol = mybox1.volume();
		System.out.println("The volume of box1 is "+vol);

		vol = mybox2.volume();
		System.out.println("The volume of box2 is "+vol);
	}
}