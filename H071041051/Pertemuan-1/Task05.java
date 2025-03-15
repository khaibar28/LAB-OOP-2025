import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);  
      System.out.print("Masukan Password = ");
      String x = in.nextLine();
      in.close();
      
      if (x.length() >= 8) {
        if (x.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")){
            System.out.println("Password Valid");
        }else{
            System.out.println("Password Invalid");
          }
      }else{
        System.out.println("Password Invalid");
      }
    }
}
