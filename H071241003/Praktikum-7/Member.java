import java.util.*;

public class Member {
    private String name;
    private int memberId;
    private List<LibraryItem> borrowedItems;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String borrow(LibraryItem item, int days) {
        if (item.isBorrowed()) throw new IllegalStateException("Item tidak tersedia.");
        String result = item.borrowItem(days);
        borrowedItems.add(item);
        return result;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        if (!borrowedItems.contains(item)) throw new IllegalStateException("Item tidak dipinjam oleh member ini.");
        borrowedItems.remove(item);
        double fine = item.calculateFine(daysLate);
        item.returnItem();
        return "Item " + item.getTitle() + " berhasil dikembalikan dengan denda: Rp " + fine;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}