import java.util.Scanner;

public class Task02 {
   public static void main(String[] args) {
       int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       Scanner input = new Scanner(System.in);
       System.out.print("Masukan angka yang mau dicari = ");
       int x = input.nextInt();
       input.close();

       try {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == x) {
                    System.out.println("Found "+ x + " at [" + (i) + "][" + (j)+"]");
                }
            }
        }
       } catch (Exception e) {
        System.out.println("angka tidak ditemukan");
       }
   }
}