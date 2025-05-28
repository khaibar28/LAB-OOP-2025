
class Wizard extends Hero {
    public Wizard(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void Serang() {
        System.out.printf("%s menyihir dengan kekuatan %s!", this.name, this.attackPower);

    }

    
}