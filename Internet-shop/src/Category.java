public class Category {
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
           System.out.print(prod.getName()+" "+prod.value+" "+prod.rating+", ");
       }
       System.out.println();
    }
}