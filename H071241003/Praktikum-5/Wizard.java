public class Wizard extends Hero{

    public Wizard(String name, int health, int attackPower) {
        super("Penyihir", 80, 20);
    }

    @Override
    public void serang(){
        System.out.println(name + " menyihir dengan kekuatan " + attackPower);
    }
}
