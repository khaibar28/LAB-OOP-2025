public class Fighter extends Hero {
    public Fighter(String name) {
        this(name, 120, 18); // Memanggil constructor lain dalam class ini
    }

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower); // Memanggil constructor di superclass Hero
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}
