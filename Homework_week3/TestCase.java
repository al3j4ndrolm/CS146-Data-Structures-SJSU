package Homework_week3;

import java.util.ArrayList;

public class TestCase {
    ArrayList<WordFrequency> frequentWords;
    ArrayList<WordFrequency> expected;

    TestCase(ArrayList<WordFrequency> frequentWords, ArrayList<WordFrequency> expected) {
        this.frequentWords = frequentWords;
        this.expected = expected;
    }
}
