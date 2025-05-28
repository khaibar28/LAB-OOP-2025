import java.util.Random;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rows = 3, cols = 3;
        int[][] nums = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[i][j] = random.nextInt(9) + 1;
            }
        }

        System.out.println("Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = scanner.nextInt();

            boolean found = false;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        found = true;
                        break;
                    }
                }
              
            }

            if (!found) {
                System.out.println("Angka tidak ditemukan.");
            }

        } catch (Exception e) {
            System.out.println("Input tidak valid! Masukkan angka saja.");
        } finally {
            scanner.close();
        }
    }
}

