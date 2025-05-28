
class Fighter extends Hero {
    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void Serang() {
        System.out.printf("%s Memukul dengan kekuatan %s!", this.name, this.attackPower);
    }

    public void SerangLawan() {
        this.Serang();
    }
}