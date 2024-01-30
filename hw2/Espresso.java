package hw2;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk to Espresso");
    }
}
