public class Main {
    private static Library library = new Library();
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);
    private static int nextItemId = 123;
    private static int nextMemberId = 123;
    
    public static void main(String[] args) {
        boolean mulai = true;
        
        System.out.println("===== Sistem Manajemen Perpustakaan =====");
        
        while (mulai) {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah DVD");
            System.out.println("3. Tambah Member");
            System.out.println("4. Pinjam Item");
            System.out.println("5. Kembalikan Item");
            System.out.println("6. Lihat Status Perpustakaan");
            System.out.println("7. Lihat Log Aktivitas");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilih = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilih) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addDVD();
                    break;
                case 3:
                    addMember();
                    break;
                case 4:
                    borrowItem();
                    break;
                case 5:
                    returnItem();
                    break;
                case 6:
                    System.out.println(library.getLibraryStatus());
                    break;
                case 7:
                    System.out.println(library.getAllLogs());
                    break;
                case 8:
                    mulai = false;
                    System.out.println("Terima kasih telah menggunakan Sistem Manajemen Perpustakaan");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        
        scanner.close();
    }
    
    private static void addBook() {
        System.out.print("Judul buku: ");
        String title = scanner.nextLine();
        
        System.out.print("Penulis: ");
        String author = scanner.nextLine();
        
        Book book = new Book(title, nextItemId++, author);
        System.out.println(library.addItem(book));
    }
    
    private static void addDVD() {
        System.out.print("Judul DVD: ");
        String title = scanner.nextLine();
        
        System.out.print("Durasi (menit): ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        
        DVD dvd = new DVD(title, nextItemId++, duration);
        System.out.println(library.addItem(dvd));
    }
    
    private static void addMember() {
        System.out.print("Nama member: ");
        String name = scanner.nextLine();
        
        Member member = new Member(name, nextMemberId++);
        System.out.println(library.addMember(member));
    }
    
    private static void borrowItem() {
        try {
            System.out.print("ID Member: ");
            int memberId = scanner.nextInt();
            
            System.out.print("ID Item: ");
            int itemId = scanner.nextInt();
            
            System.out.print("Durasi peminjaman (hari): ");
            int days = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println(library.borrowItem(memberId, itemId, days));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void returnItem() {
        try {
            System.out.print("ID Member: ");
            int memberId = scanner.nextInt();
            
            System.out.print("ID Item: ");
            int itemId = scanner.nextInt();
            
            System.out.print("Keterlambatan (hari, 0 jika tidak terlambat): ");
            int daysLate = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println(library.returnItem(memberId, itemId, daysLate));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}