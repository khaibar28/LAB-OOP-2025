import java.util.*;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private LibraryLogger logger = new LibraryLogger();

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.getTitle() + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) {
        return items.stream().filter(i -> i.getItemId() == itemId).findFirst()
                .orElseThrow(() -> new NoSuchElementException("Item tidak ditemukan."));
    }

    public Member findMemberById(int memberId) {
        return members.stream().filter(m -> m.getMemberId() == memberId).findFirst().orElse(null);
    }

    public String getLibraryStatus() {
        StringBuilder sb = new StringBuilder();
        for (LibraryItem item : items) {
            sb.append(item.getDescription())
              .append(" - ")
              .append(item.isBorrowed() ? "Dipinjam" : "Tersedia")
              .append("\n");
        }
        return sb.toString();
    }

    public String getAllLogs() {
        return logger.getLogs();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public LibraryLogger getLogger() {
        return logger;
    }
}