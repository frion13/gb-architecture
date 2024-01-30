package hw2;

public class CoffeeShop {
    public static void main(String[] args) {
        // Заказ Espresso
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.brew();
        espresso.addCondiments();

        System.out.println();

        // Заказ Latte
        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        latte.brew();
        latte.addCondiments();
    }
}
