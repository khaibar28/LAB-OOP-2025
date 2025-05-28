public class Archer extends Hero {
    public Archer(String name, int health, int attackPower, String weapon) {
        super(name, health, attackPower, weapon);
    }

    @Override
    void attack() {
        System.out.println(name + " menyerang menggunakan " + weapon + " dengan kekuatan " + attackPower);
    }
}