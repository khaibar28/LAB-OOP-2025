import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item yang Dipinjam Anggota");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Jenis item (book/dvd): ");
                        String type = scanner.nextLine();
                        System.out.print("Judul: ");
                        String title = scanner.nextLine();
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        LibraryItem item = null;
                        if (type.equalsIgnoreCase("book")) {
                            System.out.print("Author: ");
                            String author = scanner.nextLine();
                            item = new Book(title, id, author);
                        } else if (type.equalsIgnoreCase("dvd")) {
                            System.out.print("Durasi (menit): ");
                            int duration = scanner.nextInt();
                            scanner.nextLine();
                            item = new DVD(title, id, duration);
                        }
                        if (item != null) {
                            System.out.println(library.addItem(item));
                        }
                        break;
                    case 2:
                        System.out.print("Nama: ");
                        String name = scanner.nextLine();
                        System.out.print("ID anggota: ");
                        int memberId = scanner.nextInt();
                        scanner.nextLine();
                        Member member = new Member(name, memberId);
                        library.addMember(member);
                        break;
                    case 3:
                        System.out.print("ID anggota: ");
                        int borrowMemberId = scanner.nextInt();
                        scanner.nextLine();
                        Member borrower = library.findMemberById(borrowMemberId);
                        System.out.print("ID item: ");
                        int itemId = scanner.nextInt();
                        System.out.print("Lama pinjam (hari): ");
                        int days = scanner.nextInt();
                        scanner.nextLine();
                        LibraryItem borrowItem = library.findItemById(itemId);
                        String borrowResult = borrower.borrow(borrowItem, days);
                        library.getLogger().logActivity(borrowResult + " oleh " + borrower.getName());
                        System.out.println(borrowResult);
                        break;
                    case 4:
                        System.out.print("ID anggota: ");
                        int returnMemberId = scanner.nextInt();
                        scanner.nextLine();
                        Member returner = library.findMemberById(returnMemberId);
                        System.out.print("ID item: ");
                        int returnItemId = scanner.nextInt();
                        System.out.print("Hari keterlambatan: ");
                        int daysLate = scanner.nextInt();
                        scanner.nextLine();
                        LibraryItem returnItem = library.findItemById(returnItemId);
                        String returnResult = returner.returnItem(returnItem, daysLate);
                        library.getLogger().logActivity(returnResult + " oleh " + returner.getName());
                        System.out.println(returnResult);
                        break;
                    case 5:
                        System.out.println(library.getLibraryStatus());
                        break;
                    case 6:
                        System.out.println(library.getAllLogs());
                        break;
                    case 7:
                        System.out.print("Masukkan ID anggota: ");
                        int lookupId = scanner.nextInt();
                        scanner.nextLine();
                        Member m = library.findMemberById(lookupId);
                        if (m != null) {
                            System.out.println("Item yang sedang dipinjam oleh " + m.getName() + ":");
                            for (LibraryItem borrowed : m.getBorrowedItems()) {
                                System.out.println("- " + borrowed.getTitle());
                            }
                        } else {
                            System.out.println("Anggota tidak ditemukan.");
                        }
                        break;
                    case 8:
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }
}