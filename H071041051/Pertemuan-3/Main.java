public class Main {
    public static void main(String[] args) {
        Ibukota jakarta = new Ibukota("Jakarta", 10000000);
        Negara indonesia = new Negara("Indonesia", "Joko Widodo", 300000, jakarta);

        Ibukota moscow = new Ibukota("Moscow", 12000000);
        Negara rusia = new Negara("Rusia", "Vladimir Putin", 500000, moscow);

        Pertempuran pertempuran = new Pertempuran();
        pertempuran.serang(indonesia, rusia);

        System.out.println("\n");

        Negara Tukangperang = new Negara();

        Ibukota ottawa = new Ibukota("ottawa", 10000000);

        Negara Kanada = new Negara("Kanada", "Justin Trudeau", 300000, ottawa);
        Pertempuran pertempuran2 = new Pertempuran();
        pertempuran2.serang(Tukangperang,Kanada);

        System.out.println("\n");
        Tukangperang.tampilkanStatus();
        System.out.println("\n");
        Kanada.tampilkanStatus();
        System.out.println("\n");
        ottawa.tampilkanStatus();
        

    }

}