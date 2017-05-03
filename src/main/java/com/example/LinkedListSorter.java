package com.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListSorter {

	private LinkedList sortBasedOnElement(LinkedList list, Boolean oddToBack) {
		ListIterator<Integer> listIterator = list.listIterator();
    	LinkedList sortedLinkedList = (LinkedList) list.clone();
    	while (listIterator.hasNext()) {
			Integer next = (Integer) listIterator.next();
			if ((next % 2 == 0 && !oddToBack) || (next % 2 != 0 && oddToBack)) {
				sortedLinkedList.remove(next);
				sortedLinkedList.addLast(next);
			}
		}
        return sortedLinkedList;
	}

    public LinkedList putEvenNumbersToBack(LinkedList list) {
    	return sortBasedOnElement(list, false);
    }

    public LinkedList putOddNumbersToBack(LinkedList list) {
    	return sortBasedOnElement(list, true);
    }
}
