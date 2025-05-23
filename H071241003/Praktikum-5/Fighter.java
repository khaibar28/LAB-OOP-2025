public class Fighter extends Hero {
    public Fighter(String name, int health, int attackPower) {
        super("Petarung", 80, 10);
    }

    @Override
    public void serang(){
        System.out.println(name + " meninju dengan kekuatan " + attackPower);
    }
}
