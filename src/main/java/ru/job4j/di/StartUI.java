package ru.job4j.di;

public class StartUI {

    private Store store;
    private ConsoleInput in;

    public StartUI(Store store, ConsoleInput in) {
        this.store = store;
        this.in = in;
    }

    public void add() {
        String value = in.askStr("Enter value: ");
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
