package classes;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream ice = new IceCream("Vanilla", 20, 2);
        ice.addTopping("Sprinkles");
        ice.addTopping("gems");
        ice.addTopping("berries");
        ice.printToppings();
    }
}
