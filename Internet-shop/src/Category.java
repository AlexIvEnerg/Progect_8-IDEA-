
public class Category {  // кат-рии разновидностей товаров
    String name;
    int vol; // колич-во товаров в категории
    Product[] goods = new Product[vol];
    Category(int v,String n) {
        this.vol = v;
        this.name = n;
    }
    public void Goods(Product[] prod) {
        goods = prod;
    }
    public void forPrint(Product[] arr) {
       for (Product prod : arr) {
           System.out.println(prod.getName()+" "+prod.value+" "+prod.rating+", ");
       }
       System.out.println();
    }
}