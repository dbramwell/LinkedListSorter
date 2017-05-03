package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;

public class LinkedListSorterTest {

    @Test public void testPutEvenNumbersToBack() {
        LinkedListSorter sorter = new LinkedListSorter();
        LinkedList list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        LinkedList<Integer> sortedList = sorter.putEvenNumbersToBack(list);
        assertEquals((int) 1, (int) sortedList.get(0));
        assertEquals((int) 3, (int) sortedList.get(1));
        assertEquals((int) 5, (int) sortedList.get(2));
        assertEquals((int) 2, (int) sortedList.get(3));
        assertEquals((int) 4, (int) sortedList.get(4));
    }

    @Test public void testPutOddNumbersToBack() {
        LinkedListSorter sorter = new LinkedListSorter();
        LinkedList list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        LinkedList<Integer> sortedList = sorter.putOddNumbersToBack(list);
        assertEquals((int) 2, (int) sortedList.get(0));
        assertEquals((int) 4, (int) sortedList.get(1));
        assertEquals((int) 1, (int) sortedList.get(2));
        assertEquals((int) 3, (int) sortedList.get(3));
        assertEquals((int) 5, (int) sortedList.get(4));
    }
}
