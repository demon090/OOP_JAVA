package seminar_02;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Person person_1 = new Person("Иван");
        Person person_2 = new Person("Ольга");
        Person person_3 = new Person("Алексей");

        market.enqueue(person_1);
        market.enqueue(person_2);
        market.enqueue(person_3);

        System.out.println(":   " + market.size());
        System.out.println(":   " + market.dequeue());
        System.out.println(":   " + market.size());

        Order order_1 = new Order("Заказ 1");
        Order order_2 = new Order("Заказ2");

        market.placeOrder(order_1);
        market.placeOrder(order_2);

        market.update();
        market.update();
        market.update();
        market.update();
    }
}
