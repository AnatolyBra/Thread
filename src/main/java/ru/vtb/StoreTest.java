package ru.vtb;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store(200);
        Producer producer1 = new Producer(store);
        Producer producer2 = new Producer(store);
        Producer producer3 = new Producer(store);
        Consumer consumer1 = new Consumer(store);
        Consumer consumer2 = new Consumer(store);

        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
