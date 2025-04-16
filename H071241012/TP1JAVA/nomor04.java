import java.util.Scanner;

public class nomor04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();

        if (n < 0 ){
            System.out.println("Hasil faktorial dari " + n + " tidak terdefinisi" );
        } else {
            long hasil = faktorial(n);

            System.out.println("Hasil faktorial dari " + n + " adalah: " + hasil);
    
            scanner.close();
        }
      
    }

    public static long faktorial(int n){
        if (n == 0 || n==1) {  
            return 1;
        }else {
            return n * faktorial(n - 1);

        }
    }
}
