public class Book extends LibraryItem {
    private String author;
    
    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }
    
    @Override
    public String getDescription() {
        return "Buku: " + title + " oleh " + author + ", ID: " + itemId;
    }
    
    @Override
    public String borrowItem(int days) {
        if (days > 14) {
            throw new IllegalArgumentException("Buku hanya dapat dipinjam maksimal 14 hari");
        }
        
        if (isBorrowed) {
            throw new IllegalArgumentException("Buku ini sedang dipinjam");
        }
        
        this.isBorrowed = true;
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }
    
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 10000;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void bookInfo() {
        System.out.println(getDescription());
    }
}