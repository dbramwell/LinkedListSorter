package com.example;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.LinkedList;

public class LinkedListSorterTest {

	LinkedListSorter sorter;
    LinkedList<Integer> list;

	@Before public void initialize() {
        sorter = new LinkedListSorter();
        list = new LinkedList<Integer>();
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(10);
        list.add(1);
    }

    @Test public void testPutEvenNumbersToBack() {
        LinkedList<Integer> sortedList = sorter.putEvenNumbersToBack(list);
        assertEquals((int) 7, (int) sortedList.get(0));
        assertEquals((int) 3, (int) sortedList.get(1));
        assertEquals((int) 1, (int) sortedList.get(2));
        assertEquals((int) 8, (int) sortedList.get(3));
        assertEquals((int) 10, (int) sortedList.get(4));
    }

    @Test public void testPutOddNumbersToBack() {
        LinkedList<Integer> sortedList = sorter.putOddNumbersToBack(list);
        assertEquals((int) 8, (int) sortedList.get(0));
        assertEquals((int) 10, (int) sortedList.get(1));
        assertEquals((int) 7, (int) sortedList.get(2));
        assertEquals((int) 3, (int) sortedList.get(3));
        assertEquals((int) 1, (int) sortedList.get(4));
    }

    @Test public void testPutEvenIndexesToBack() {
    	LinkedList<Integer> sortedList = sorter.putEvenIndexesToBack(list);
        assertEquals((int) 3, (int) sortedList.get(0));
        assertEquals((int) 10, (int) sortedList.get(1));
        assertEquals((int) 7, (int) sortedList.get(2));
        assertEquals((int) 8, (int) sortedList.get(3));
        assertEquals((int) 1, (int) sortedList.get(4));
    }

    @Test public void testPutOddIndexesToBack() {
        LinkedList<Integer> sortedList = sorter.putOddIndexesToBack(list);
        assertEquals((int) 7, (int) sortedList.get(0));
        assertEquals((int) 8, (int) sortedList.get(1));
        assertEquals((int) 1, (int) sortedList.get(2));
        assertEquals((int) 3, (int) sortedList.get(3));
        assertEquals((int) 10, (int) sortedList.get(4));
    }
}
