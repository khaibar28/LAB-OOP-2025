import java.util.Scanner;
public class tugas1{
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String[] words= input.nextLine().split(" ");
    String judul = "";
    for (int i = 0; i < words.length; i++) {
        judul  += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
    }

    System.out.println(judul);  
    input.close();

}
}