package ru.vtb;

import java.util.Random;

public class Store {
    public int getItem() {
        return item;
    }

    public static int count = 0;
    private int item;

    public Store(int item) {
        this.item = item;
    }

    public synchronized void put() {
        Random random = new Random();
        int newItem;
        while (item >= 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        while (item < 80) {
            newItem = random.nextInt(100);
            item = item + newItem;
            System.out.println("Производитель добавил " + newItem + " товар. Теперь на складе: " + item + " count = " + count);
            notify();
        }

    }

    public synchronized void get() {
        item--;
        count++;
        System.out.println("Покупатель купил 1 товар. Теперь на складе: " + item + " count = " + count);
        notify();
    }
}
