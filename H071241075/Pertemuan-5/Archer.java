
class Archer extends Hero {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void Serang() {
        System.out.printf("%s Memanah dengan kekuatan %s!", this.name, this.attackPower);

    }

    
}
