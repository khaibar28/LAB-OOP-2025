import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cuboid cuboid = new Cuboid();
        System.out.print("Masukan Tinggi :");
        cuboid.height = in.nextDouble();
        System.out.print("Masukan Lebar :");
        cuboid.width = in.nextDouble();
        System.out.print("Masukan Panjang :");
        cuboid.length = in.nextDouble();
        System.out.printf("Volume = %.2f%n", cuboid.getVolume());
    }
}

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}
