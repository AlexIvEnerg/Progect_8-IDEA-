import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Category cat1 = new Category(5, "cat1"); // Vegeta
        Category cat2 = new Category(3, "cat2"); // Bread
        Category cat3 = new Category(4, "cat3"); // Meat
        User user_1 = new User(6);
        User user_2 = new User(3);
        User user_3 = new User(5);
        Product[] bask1 = new Product[cat1.vol];
        bask1[0]= new Product("Tomatoes",50.4,7);
        bask1[1]= new Product("Cucumber", 40.8, 6);
        bask1[2]= new Product("Carrot", 30.7, 4);
        bask1[3]= new Product("Onion", 28.6, 5);
        bask1[4]= new Product("Сabbage", 24.5, 4);
        Product[] bask2 = new Product[cat2.vol];
        bask2[0]= new Product("Loaf", 19.7, 6);
        bask2[1]= new Product("Rye_bread", 21.8, 7);
        bask2[2]= new Product("Oatmeal_bread", 41.3, 5);

        cat1.Goods(bask1);
        System.out.println(Arrays.toString(cat1.goods));
        cat2.Goods(bask2);
        System.out.println(Arrays.toString(cat2.goods));

        user_1.bask.basket[0]=bask1[0];
    }
}
