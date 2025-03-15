public class Task04 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static long factorial(int value){
       if (value <= 0){
           throw new IllegalArgumentException("Tidak ada faktorial untuk nilai negatif atau nol");
       } else if (value == 1){
           return 1;
       } else{
           return value * factorial(value-1);
       }
    }
}