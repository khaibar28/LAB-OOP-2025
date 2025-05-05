class Cuboid{
	double height;
	double widht;
	double length;

	double getVolume(){
		return height * widht * length;
	}
}

public class soal3{

	public static void main(String[] args) {

		Cuboid cuboid = new Cuboid();

		cuboid.height = 30;
		cuboid.widht = 15;
		cuboid.length = 10;

		System.out.printf("Volume = %.2f", cuboid.getVolume());
	}
}
