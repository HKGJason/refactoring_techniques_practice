package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1));
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("ABC", orders);
        assertEquals("*****************************" +System.getProperty("line.separator")+
                "****** Customer totals ******" +System.getProperty("line.separator")+
                "*****************************" +System.getProperty("line.separator")+
                "name: ABC" +System.getProperty("line.separator")+
                "amount: 1.0"+System.getProperty("line.separator"), outContent.toString());
    }
}