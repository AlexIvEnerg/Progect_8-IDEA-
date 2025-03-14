import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Authentication buyer = new Authentication();
        System.out.print("Введите логин и пароль: ");
        buyer.requisites(); // Аутентиф-ция покупателя
        // System.out.println(" ");
        System.out.print("Список каталогов товаров: ");
        Category cat1 = new Category(5, "Vegetate");
        Category cat2 = new Category(3, "Bread");
        Category cat3 = new Category(4, "Meat");
        System.out.println(cat1.name+" "+cat2.name+" "+cat3.name);
        // System.out.println(" ");
        System.out.print("Какое количество товаров приобретается: ");
        Scanner scanner1 = new Scanner(System.in);
        buyer.n = scanner1.nextInt(); System.out.println(buyer.n);
        Product[] bask1 = new Product[cat1.vol]; // vol - количество товаров в кат-рии
        bask1[0]= new Product("Tomatoes",50.4,7);
        bask1[1]= new Product("Cucumber", 40.8, 6);
        bask1[2]= new Product("Carrot", 30.7, 4); // морковь
        bask1[3]= new Product("Onion", 28.6, 5); //  репчатый лук
        bask1[4]= new Product("Cabbage", 24.5, 4); // капуста
        Product[] bask2 = new Product[cat2.vol];
        bask2[0]= new Product("Loaf", 19.7, 6);
        bask2[1]= new Product("Rye_bread", 21.8, 7);  // ржаной
        bask2[2]= new Product("Oatmeal_bread", 41.3, 5);  // овсяный
        Product[] bask3 = new Product[cat3.vol];
        bask3[0]= new Product("Sausage", 130, 7);
        bask3[1]= new Product("Brisket", 180, 8);
        bask3[2]= new Product("Chicken", 120, 6);
        bask3[3]= new Product("Cutlets", 150, 7);
        cat1.Goods(bask1); cat2.Goods(bask2); cat3.Goods(bask3);
        buyer.assign();

        System.out.println("Выберите каталог: "); Scanner scanner2 = new Scanner(System.in);
        String name_cat= scanner2.nextLine();
        String name_prod;
        for(int i = 0; i<buyer.n; i++) {
            switch (name_cat) {
                case "Vegetate":
                    cat1.forPrint(cat1.goods);
                    System.out.println("Выберите по имени нужные товары ");
                    Scanner scanner3 = new Scanner(System.in);
                    name_prod = scanner3.nextLine();
                    switch (name_prod) {
                        case "Tomatoes":
                            buyer.user.bask.basket[i]=bask1[0];
                            break;
                        case "Cucumber":
                            buyer.user.bask.basket[i]=bask1[1];
                            break;
                        case "Carrot":
                            buyer.user.bask.basket[i]=bask1[2];
                            break;
                        case "Onion":
                            buyer.user.bask.basket[i]=bask1[3];
                            break;
                        case "Cabbage":
                            buyer.user.bask.basket[i]=bask1[4];
                            break;
                    }
                    break;
                case "Bread":
                    cat2.forPrint(cat2.goods);
                    System.out.println("Выберите по имени нужные товары ");
                    Scanner scanner4 = new Scanner(System.in);
                    name_prod = scanner4.nextLine();
                    switch (name_prod) {
                        case "Loaf":
                            buyer.user.bask.basket[i]=bask2[0];
                            break;
                        case "Rye_bread":
                            buyer.user.bask.basket[i]=bask2[1];
                            break;
                        case "Oatmeal_bread":
                            buyer.user.bask.basket[i]=bask2[2];
                            break;
                    }
                    break;
                case "Meat":
                    cat3.forPrint(cat3.goods);
                    System.out.println("Выберите по имени нужные товары ");
                    Scanner scanner5 = new Scanner(System.in);
                    name_prod = scanner5.nextLine();
                    switch (name_prod) {
                        case "Sausage":
                            buyer.user.bask.basket[i]=bask3[0];
                            break;
                        case "Brisket":
                            buyer.user.bask.basket[i]=bask3[1];
                            break;
                        case "Chicken":
                            buyer.user.bask.basket[i]=bask3[2];
                            break;
                        case "Cutlets":
                            buyer.user.bask.basket[i]=bask3[3];
                            break;
                    }
                    break;
            } if (i==buyer.n-1) break;
            System.out.println("Попробуйте выбрать требуемые товары в" +
                    " других каталогах"); Scanner scanner6 = new Scanner(System.in);
            name_cat = scanner6.nextLine();
        }
        System.out.println("Пожалуйста, внесите оплату за каждый выбранный товар");
        double pay;
        Scanner scan_pay = new Scanner(System.in);
            for (int n = 0; n < buyer.n; n++) {
                System.out.println(buyer.user.bask.basket[n].getName() + "="
                        + buyer.user.bask.basket[n].value);
                do {
                    pay = scan_pay.nextDouble();
                    System.out.println(" ");
                    if (pay < buyer.user.bask.basket[n].value) System.out.println("введённая величина меньше " +
                            "требуемой, внесите верную оплату ");
                    else if (pay > buyer.user.bask.basket[n].value) {
                        System.out.println("введённая величина больше требуемой, внесите верную оплату ");
                    }
                } while (pay != buyer.user.bask.basket[n].value);
            }
    }
}