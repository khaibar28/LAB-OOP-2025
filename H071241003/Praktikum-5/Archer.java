public class Archer extends Hero {
    public Archer(String name, int health, int attackPower) {
        super("Pemanah", 80, 30);
    }

    @Override
    public void serang(){
        System.out.println(name + " memanah dengan kekuatan " + attackPower);
    }
}
