package Homework_week1_day2.src;

import java.util.ArrayList;
import java.util.List;

/*
 Alejandro Lopez - CS146 - SJSU

 So my approach is similar to what was discussed at class, and I got to understand better
 how to handle the remaining array in the case when one of then is shorter than the other.

 I simply used two pointers, one for each array and add them to a result array as it goes.

 Space complexity: O(n)
 Time complexity: O(n)

*/

public class HomeworkWeek1 {
    static void main() {
        System.out.print(mergeSort(
                List.of(1,2,4,5),
                List.of(3,4,5)
        ));
    }

    public static List<Integer> mergeSort(List<Integer> left, List<Integer> right) {

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < left.size() && j < right.size()) {

            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));
        return result;
    }
}
