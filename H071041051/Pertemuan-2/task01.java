public class task01 {
    public static class Person {
        String nama;
        int umur;
        boolean gender;
    
        public void setName(String nama) {
            this.nama = nama;
        }
    
        public String getName() {
            return nama;
        }
    
        public void setAge(int umur) {
            this.umur = umur;
        }
    
        public int getAge() {
            return umur;
        }
    
        public void setGender(boolean gender) {
            this.gender = gender;
        }
    
        public String getGender() {
            if (gender) {
                return "Male";
            } else {
                return "Female";
            }
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rey");
        person.setAge(20);
        person.setGender(true);

        System.out.println("Nama: " + person.getName());
        System.out.println("Umur: " + person.getAge());
        System.out.println("Jenis Kelamin: " + person.getGender());
    }
}
