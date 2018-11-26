package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();

        printBanner();

        double outstanding = getOutstanding(orders);

        printDetails(name, outstanding);

    }

    private void printDetails(String name, double outstanding) {
        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private void printBanner() {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }
    private double getOutstanding(List<Order> orders){
        double outstanding = 0.0;
        while (orders.iterator().hasNext()){
            Order order = (Order) orders.iterator().next();
            outstanding += order.getAmount();
        }
        return outstanding;
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
