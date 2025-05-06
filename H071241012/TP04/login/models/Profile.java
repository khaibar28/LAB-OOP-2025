package login.models;

public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String fullName;
    private String nickName;
    private int age;
    private String hobby;

    public Profile() {
        // Constructor kosong
    }

    // Getter dan Setter
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

