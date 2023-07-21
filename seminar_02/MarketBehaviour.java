package seminar_02;

public interface MarketBehaviour {
    void placeOrder(Order order);
    Order takeOrder();
    boolean hasOrder();
}



public void update(){
    if (hasOrder()) {
    Order order = takeOrder();
    System.out.println("Заказ обработан:    " + order.toString());
    }
    else{
        System.out.println("Очередь заказов пуста:");
    }
}

