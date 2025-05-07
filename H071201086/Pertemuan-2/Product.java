package TugasPraktikum02;

public class Product {
    public int id;
    public String name;
    public int stock;
    public double price;

    public Product(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProductInfo() {
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Stock        : " + stock);
        System.out.println("Price        : Rp " + price);
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "Jaket Hoodie Nike", 25, 550000);
        Product product2 = new Product(102, "Sweater Rajut Zara", 14, 329000);
        Product product3 = new Product(103, "Jaket Bomber Alpha Industries", 0, 799000);

        System.out.println("=== Product 1 ===");
        product1.displayProductInfo();
        System.out.println("Available: " + (product1.isAvailable() ? "Yes" : "No"));

        System.out.println("\n=== Product 2 ===");
        product2.displayProductInfo();
        System.out.println("Available: " + (product2.isAvailable() ? "Yes" : "No"));

        System.out.println("\n=== Product 3 ===");
        product2.displayProductInfo();
        System.out.println("Available: " + (product3.isAvailable() ? "Yes" : "No"));
    }
}
