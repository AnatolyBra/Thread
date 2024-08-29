package ru.vtb;

public class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (store.getItem() > 0) {
            store.get();
        }
    }
}
