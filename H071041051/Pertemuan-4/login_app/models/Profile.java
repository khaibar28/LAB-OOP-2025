package login_app.models;

public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;

   
    public Profile(String fullName, int age, String hobby) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = fullName; 
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}