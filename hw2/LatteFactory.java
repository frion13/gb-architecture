package hw2;

public class LatteFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
