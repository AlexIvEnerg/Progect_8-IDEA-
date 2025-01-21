public class Product {
    String name;
    double value;
    int rating;
    public Product(String name) { this.name = name; }
    public Product(String name, double val, int rat) {
        this(name);
        this.value=val;
        this.rating=rat;
    }
}
