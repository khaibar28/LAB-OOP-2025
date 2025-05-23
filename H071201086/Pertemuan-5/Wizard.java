public class Wizard extends Hero {
    Wizard(String name, int health, int attackPower, String weapon) {
        super(name, health, attackPower, weapon);
    }

    @Override
    void attack() {
        System.out.println(name + " menyerang menggunakan " + weapon + " dengan kekuatan " + attackPower);
    }
}