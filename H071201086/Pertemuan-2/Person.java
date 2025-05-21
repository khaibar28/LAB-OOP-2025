package TugasPraktikum02;

public class Person {
    public String name;
    public int age;
    public boolean isMale;

    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    public String getGender() {
        return isMale ? "Male" : "Female";
    }
    public static void main(String[] args) {
        Person person = new Person("Wiwit", 22, true)
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        person.setName("Wiwit Ramadhani");
        person.setAge(22);
        person.setGender(false);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Gender: " + person.getGender());
    }

}
