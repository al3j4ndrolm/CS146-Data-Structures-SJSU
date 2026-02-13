package Homework_week3;

import java.util.ArrayList;

public class HomeworkWeek3 {
    static void main() {
        TestCase test = new TestCaseProvider().BUILD_MAX_HEAP_TEST_CASE;
        buildMaxHeap(test.frequentWords);
    }

    static void maxHeapify(ArrayList<WordFrequency> arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr.get(left).frequency() > arr.get(largest).frequency()) {
            largest = left;
        }

        if (right < n && arr.get(right).frequency() > arr.get(largest).frequency()) {
            largest = right;
        }

        if (largest != i) {
            WordFrequency swap = arr.get(i);
            arr.set(i,  arr.get(largest));
            arr.set(largest, swap);
            maxHeapify(arr, n, largest);
        }
    }

    static void buildMaxHeap(ArrayList<WordFrequency> arr) {
        int n = arr.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
        arr.forEach(object -> System.out.println(object.frequency()));
    }
}
