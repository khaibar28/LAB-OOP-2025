public class soal1 {
	private String name;
	private int age;
	private Boolean isMale;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}

	public void setGender(Boolean isMale) {
		this.isMale = isMale;
	}
	public String getGender() {
		return this.isMale ? "Laki-laki" : "Perempuan";
	}

	public static void main(String[] args) {
		soal1 person = new soal1();
        person.setName("Ryan");
        person.setAge(19);
        person.setGender(true);

        System.out.println("Name   : " + person.getName());
        System.out.println("Age    : " + person.getAge());
        System.out.println("Gender : " + person.getGender());
	}

}