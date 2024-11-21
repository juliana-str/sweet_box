package sweets;

public class Candy extends SweetBox {
    private final String taste;

    public Candy(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Конфеты [" + super.toString() + ", вкус: " + this.taste + "]";
    }
}
