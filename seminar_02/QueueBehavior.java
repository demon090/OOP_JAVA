package seminar_02;

public interface QueueBehavior {
    void enqueue(Person person);
    Person dequeue();
    boolean isEmpty();
    int size();
}
