package No1;

public class Biodata {
    String name;       
    int age;
    boolean isMale;

    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    String getGender(){
        return this.isMale ? "Laki-laki" : "Perempuan";
    }
}
