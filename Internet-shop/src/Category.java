public class Category {
    String name;
    int vol; // колич-во товаров
    Product[] goods = new Product[vol];
    Category(int v,String n) {
        this.vol = v;
        this.name = n;
    }
    public void Goods(Product[] prod) {
        goods = prod;
    }
}
