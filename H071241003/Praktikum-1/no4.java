import java.util.Scanner;

public class no4 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = x.nextInt();
        if(n < 0){
            System.out.println("Input harus positif");
        }else{
            System.out.println(factorial(n));
        }

        x.close();
    }
    public static int factorial(int n) {
        if(n == 1 || n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
        
    }
}
