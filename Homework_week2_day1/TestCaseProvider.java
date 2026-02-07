package Homework_week2_day1;

public class TestCaseProvider {

    public static TestCase[] getQuickSortTestCases(){
        return new TestCase[] {
                new TestCase(
                        new int[]{10, 17, 19, 21, 44, 55, 57, 63, 65, 67},
                        new int[]{10, 17, 19, 21, 44, 55, 57, 63, 65, 67}
                ),
                new TestCase(
                        new int[]{},
                        new int[]{}
                ),
                new TestCase(
                        new int[]{84, 3, 7, 1, 9, 6, 2, 5},
                        new int[]{1, 2, 3, 5, 6, 7, 9, 84}
                )
        };
    }
}
