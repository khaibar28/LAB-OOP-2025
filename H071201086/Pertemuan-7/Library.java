import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private LibraryLogger logger;
    
    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
        this.logger = new LibraryLogger();
    }
    
    public String addItem(LibraryItem item) {
        items.add(item);
        logger.logActivity("Item " + item.getTitle() + " ditambahkan ke perpustakaan");
        return item.getTitle() + " berhasil ditambahkan";
    }
    
    public LibraryItem findItemById(int itemId) {
        return items.stream()
                .filter(item -> item.getItemId() == itemId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Item dengan ID " + itemId + " tidak ditemukan"));
    }
    
    public String getLibraryStatus() {
        if (items.isEmpty()) {
            return "Perpustakaan kosong";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("+---------+---------+-----------+\n");
        sb.append("| ID      | Judul   | Status    |\n");
        sb.append("+---------+---------+-----------+\n");
        
        for (LibraryItem item : items) {
            sb.append(String.format("| %-7d | %-7s | %-9s |\n", 
                    item.getItemId(), 
                    item.getTitle(), 
                    item.isBorrowed() ? "Dipinjam" : "Tersedia"));
        }
        
        sb.append("+---------+---------+-----------+\n");
        
        return sb.toString();
    }
    
    public String getAllLogs() {
        return logger.getLogs();
    }
    
    public String addMember(Member member) {
        members.add(member);
        logger.logActivity("Member " + member.getName() + " ditambahkan ke perpustakaan");
        return "Member " + member.getName() + " (ID: " + member.getMemberId() + ") berhasil ditambahkan";
    }
    
    public Member findMemberById(int memberId) {
        return members.stream()
                .filter(member -> member.getMemberId() == memberId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Member dengan ID " + memberId + " tidak ditemukan"));
    }
    
    public String borrowItem(int memberId, int itemId, int days) {
        Member member = findMemberById(memberId);
        LibraryItem item = findItemById(itemId);
        
        String result = member.borrow(item, days);
        logger.logActivity(item.getDescription() + " dipinjam oleh " + member.getName());
        
        return result;
    }
    
    public String returnItem(int memberId, int itemId, int daysLate) {
        Member member = findMemberById(memberId);
        LibraryItem item = findItemById(itemId);
        
        String result = member.returnItem(item, daysLate);
        logger.logActivity(item.getDescription() + " dikembalikan oleh " + member.getName() + 
                          " dengan denda Rp " + String.format("%,.0f", item.calculateFine(daysLate)));
        
        return result;
    }
}