public class Person {
    String name;
    int age;
    public boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return isMale ? "Male" : "Female";
    }


    public static void main(String[] args) {
        Person Person = new Person();
        Person.setName("John");
        Person.setAge(20);
        Person.setMale(true);
        System.out.println(Person.getname());
        System.out.println(Person.getAge());
        System.out.println(Person.getGender());
    }   

}
