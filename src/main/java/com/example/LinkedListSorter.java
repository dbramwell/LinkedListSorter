package com.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListSorter {

	private LinkedList<Integer> sortBasedOnElement(LinkedList<Integer> list, Boolean oddToBack) {
		ListIterator<Integer> listIterator = list.listIterator();
    	LinkedList<Integer> sortedLinkedList = new LinkedList<Integer>(list);
    	while (listIterator.hasNext()) {
			Integer next = (Integer) listIterator.next();
			if ((next % 2 == 0 && !oddToBack) || (next % 2 != 0 && oddToBack)) {
				sortedLinkedList.remove(next);
				sortedLinkedList.addLast(next);
			}
		}
        return sortedLinkedList;
	}

    public LinkedList<Integer> putEvenNumbersToBack(LinkedList<Integer> list) {
    	return sortBasedOnElement(list, false);
    }

    public LinkedList<Integer> putOddNumbersToBack(LinkedList<Integer> list) {
    	return sortBasedOnElement(list, true);
    }

    private LinkedList<Integer> sortBasedOnIndex(LinkedList<Integer> list, Boolean oddToBack) {
    	ListIterator<Integer> listIterator = list.listIterator();
    	LinkedList<Integer> sortedLinkedList = new LinkedList<Integer>(list);
    	while (listIterator.hasNext()) {
			Integer next = (Integer) listIterator.next();
			if ((list.indexOf(next) % 2 == 0 && !oddToBack) || (list.indexOf(next) % 2 != 0 && oddToBack)) {
				sortedLinkedList.remove(next);
				sortedLinkedList.addLast(next);
			}
		}
        return sortedLinkedList;
    }

    public LinkedList<Integer> putOddIndexesToBack(LinkedList<Integer> list) {
    	return sortBasedOnIndex(list, true);
    }

        public LinkedList<Integer> putEvenIndexesToBack(LinkedList<Integer> list) {
    	return sortBasedOnIndex(list, false);
    }
}
