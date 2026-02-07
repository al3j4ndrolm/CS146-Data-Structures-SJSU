package Homework_week1_day2.src;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainHomework1Test {
    @Test
    void testMergeSort(){
        List<Integer> result = (HomeWork1.mergeSort(List.of(1,2,4,5), List.of(3,4,5)));
        Assertions.assertEquals(List.of(1,2,3,4,4,5,5), result);
    }

    @Test
    void mergesWithOverlap() {
        Assertions.assertEquals(List.of(1,2,3,4,4,5,5), HomeWork1.mergeSort(List.of(1,2,4,5), List.of(3,4,5)));
    }

    @Test
    void mergesWithEmptyRight() {
        Assertions.assertEquals(List.of(1,2,4,5), HomeWork1.mergeSort(List.of(1,2,4,5), List.of()));
    }
}















