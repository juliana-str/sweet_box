package sweets;

public class Cake extends SweetBox {
    private final Boolean sugarInclude;

    public Cake(String name, double weight, double price, Boolean sugarInclude) {
        super(name, weight, price);
        this.sugarInclude = sugarInclude;
    }

    @Override
    public String toString() {
        return "Печенье [" + super.toString() + ", содержание сахара: " + this.sugarInclude + "]";
    }
}
