package Homework_week2_day1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Homework2UnitTest {
    TestCase[] quickSortTestCases = TestCaseProvider.getQuickSortTestCases() ;

    @Test
    public void TestQuickSortWithLomuto(){
        for (TestCase test: this.quickSortTestCases){
            Homework2.quickSortWithLomutoPartition(test.numbersToSort, 0, test.numbersToSort.length - 1);
            assertArrayEquals(test.expected, test.numbersToSort);
        }
    }

    @Test
    public void TestQuickSortWithHoare(){
        for (TestCase test: this.quickSortTestCases){
            Homework2.quickSortWithHoarePartition(0, test.numbersToSort.length - 1, test.numbersToSort);
            assertArrayEquals(test.expected, test.numbersToSort);
        }
    }
}
