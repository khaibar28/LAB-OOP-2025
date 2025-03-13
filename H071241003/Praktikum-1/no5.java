import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan password : ");
        String pass = n.nextLine();
        boolean hbesar = false;
        boolean hkecil = false;
        boolean angka = false;
        for(char huruf : pass.toCharArray()){
            if(Character.isDigit(huruf)){
                angka = true;
            }else if(Character.isUpperCase(huruf)){
                hbesar = true;
            }else if(Character.isLowerCase(huruf)){
                hkecil = true;
            }
        }
        boolean jumvalid = pass.length() >= 8;
        boolean valid = jumvalid && angka && hbesar && hkecil;

        if(valid){
            System.out.println("Password Valid");
        }else{
            System.out.println("Password tidak valid");
        }n.close();
    }
}
