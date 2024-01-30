package hw2;

public class EspressoFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}
