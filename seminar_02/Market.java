package seminar_02;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehavior, MarketBehaviour {
    private Queue queue;
    private Queue orders;

    public Market(){
        queue = new LinkedList();
        orders = new LinkedList();
    }

    @Override
    public void enqueue(Person person){
        queue.add(person);
    }

    @Override
    public Person dequeue(){
        return (Person) queue.poll();
    }

    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    @Override
    public int size(){
        return queue.size();
    }

    @Override
    public void placeOrder(Order order){
        orders.add(order);
    }

    @Override
    public Order takeOrder(){
        return (Order) orders.poll();
    }

    @Override
    public boolean hasOrder(){
        return !orders.isEmpty();
    }

    public void update(){
        if (hasOrder()) {
            Order order = takeOrder();
            System.out.println("Заказ обработан:   " + order.toString());
        }
        else{
            System.out.println("Очередь заказов пуста");
        }
    }
}

