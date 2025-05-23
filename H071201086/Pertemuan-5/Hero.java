public class Hero {
    String name;
    int health;
    int attackPower;
    String weapon;

    Hero(String name, int health, int attackPower, String weapon) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.weapon = weapon;
    }

    void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}