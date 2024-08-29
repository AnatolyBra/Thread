package ru.vtb;

public class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (store.getItem() < 80) {
            store.put();
        }
    }
}
