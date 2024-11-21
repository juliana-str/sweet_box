import sweets.*;

public class Base {
    public static void main(String[] args) {
        Marshmallow marshmallowVanila = new Marshmallow("Зефир ванильный", 200, 54, "Ваниль", "Белый");
        Marshmallow marshmallowStrawberry = new Marshmallow("Зефир клубничный", 200, 59, "Клубника", "Розовый");
        Candy candyChocolate = new Candy("Мишка на севере", 150, 234, "Шоколадный");
        Candy candySouffle = new Candy("Птичье молоко", 200, 156, "Молочный");
        Candy candyNuts = new Candy("Белочка", 100, 290, "Орехово-шоколадный");
        Jellybean jellybean = new Jellybean("Фруктис", 150, 155, 135);
        Cake cakeOatmeal = new Cake("Овсяное печенье", 300, 125, true);
        Cake cakeBiscuits = new Cake("Галеты", 140, 125, false);
        SweetBox[] sweetBox = {marshmallowVanila, marshmallowStrawberry, candyChocolate, candyNuts, cakeOatmeal, cakeBiscuits, candySouffle, jellybean};
        double sweetBoxWeight = 0;
        double sweetBoxCost = 0;
        System.out.println("Состав сладкого подарка:");
        for (SweetBox sweet : sweetBox) {
            sweetBoxWeight += sweet.getWeight();
            sweetBoxCost += sweet.getPrice();
            System.out.println(sweet);
        }
        System.out.println("Общий вес подарка: " + sweetBoxWeight + " грамм.");
        System.out.println("Общая стоимость подарка: " + sweetBoxCost + " рублей");
    }
}
