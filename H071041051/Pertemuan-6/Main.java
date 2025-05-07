public class Main {
  public static void main(String[] args) {
    Mobil mobil = new Mobil("toyota", "fortuner");
    System.out.println(mobil.getMerek());
    System.out.println(mobil.getModel());;
    mobil.setJumlahKursi(7);
    System.out.println(mobil.getJumlahKursi());;
    mobil.setJumlahPintu(4);
    System.out.println(mobil.getJumlahPintu());;
    System.out.println(mobil.getID());
    mobil.setBahanBakar("pertamina-dex");
    System.out.println(mobil.getBahanBakar());

    Mobil mobil1 = new Mobil("toyota", "avanza");
    System.out.println(mobil1.getID());
  
  }  
}
