package hw2;

public class Latte implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Latte");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding steamed milk to Latte");

    }
}
