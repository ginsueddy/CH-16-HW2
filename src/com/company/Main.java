package com.company;

public class Main {

    /*
        Self Check: 18-30
        18. The two ways are to change the front or the next of a data field.

        19. In the middle is going to be the most expensive because everything will need to be shifted

        20. It should stop at i - 1

        21. Resizing is not necessary, and there is no limit. 

        22. ListNode current = list;
            while (current != null) {
                current.data = 42;
                current = current.next;
            }

        23. ListNode current = list;
            while (current.next != null) {
                current = current.next;
            }
            current.data = 42;

        24. ListNode current = list;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(42);

        25. public int min() {
                if (first == null) {
                    throw new IllegalStateException();
                }
                else {
                    int min = first.data;
                    ListNode current = first.next;
                    while (current != null) {
                        min = Math.min(min, current.data);
                        current = current.next;
                    }
                    return min;
                }
            }

            public int max() {
                if (first == null) {
                    throw new IllegalStateException();
                }
                else {
                    int max = first.data;
                    ListNode current = first.next;
                    while (current != null) {
                        max = Math.max(max, current.data);
                        current = current.next;
                    }
                return max;
                }
            }

        26. The four cases are the back, empty, the front and in the middle.

        27. The inchworm approach keeps track of the current and previous node. An advantage is the simplicity of it

        28. public int sum() {
                int total = 0;
                ListNode current = first;
                while (current != null) {
                    total += current.data;
                    current = current.next;
                }
                return total;
            }

            public double average() {
                if (first == null) {
                    return 0.0;
                } 
                else {
                    int total = 0;
                    int count = 0;
                    ListNode current = first;
                    while (current != null) {
                        total += current.data;
                        current = current.next;
                        count++;
                    }
                    return (double) total / count;
                }
            }

        29. Polymorphosim is the biggest advantage of having an intList interface.

        30. public void firstLast(IntList list) {
                if (!list.isEmpty()) {
                    int element = list.get(0);
                    list.remove(0);
                    list.add(element);
                }
            }
     */

    public static void main(String[] args) {
	// write your code here
    }
}
