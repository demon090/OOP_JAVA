package seminar_01;

public class Main {
    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("Coffee", 2.50, 10, 80);
        HotDrink tea = new HotDrink("tea", 1.50, 15, 70);
        HotDrink hotchocolate = new HotDrink("hot chocolate", 3.00, 8, 85);

        System.out.println(coffee.toString());
        System.out.println(tea.toString());
        System.out.println(hotchocolate.toString());
    }
}
