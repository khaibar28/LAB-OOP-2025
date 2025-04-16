package No1;

public class Main {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        // biodata.name = "Yayat";
        // biodata.age = 20;
        // biodata.isMale = true;
        biodata.setName("Yayat");
        biodata.setAge(20);
        biodata.setGender(true);
        System.out.println(biodata.getName());
        System.out.println(biodata.getAge());
        System.out.println(biodata.getGender());
    }
}
