package sweets;

public class Marshmallow extends SweetBox {
    private final String color;
    private final String taste;

    public Marshmallow(String name, double weight, double price, String taste, String color) {
        super(name, weight, price);
        this.color = color;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Зефир [" + super.toString() + ", вкус: " + this.taste + ", цвет: " + this.color + "]";
    }
}
