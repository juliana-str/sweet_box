package sweets;

public class Jellybean extends SweetBox {
    private final double calories;

    public Jellybean(String name, double weight, double price, double calories) {
        super(name, weight, price);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Жилейные конфеты [" + super.toString() + ", калории: " + this.calories + "]";
    }
}
