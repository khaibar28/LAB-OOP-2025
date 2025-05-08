public class Cuboid {
    double height;
    double width;
    double length;


    double getvolume(){
        return height * width * length;
    }

    public class main{
        public static void main(String[] args) {
            Cuboid cuboid = new Cuboid();
            cuboid.height = 10;
            cuboid.width = 5;
            cuboid.length = 3;
            System.out.println("Volume: " + cuboid.getvolume());
        }
    }
}
