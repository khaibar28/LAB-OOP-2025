import java.util.Random;
import java.util.Scanner;
public class no2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int barismatriks = 3;
        int kolommatriks = 3;
        int[][] num = new int[barismatriks][kolommatriks];
        Random random = new Random();
        for(int baris = 0; baris < num.length; baris++){
            for(int kolom = 0; kolom < num[baris].length; kolom++){
                num[baris][kolom]= random.nextInt(20)-10;
                System.out.print(num[baris][kolom] + " ");
            }System.out.println();
        }
        try{ 
        System.out.print("Masukkan Angka yang ingin dicari : ");
        int angka = x.nextInt();

        for(int baris = 0; baris < num.length; baris++){
            for(int kolom = 0; kolom < num[baris].length; kolom++){
                if(num[baris][kolom] == angka){
                    System.out.println("Founds "+ angka +" at [" + baris + "][" + kolom + "]");
                }
            }
        }
    } catch(Exception e){
        System.out.println("Inputan tidak termasuk dalam array "+ e.getMessage());
    }
    }
}