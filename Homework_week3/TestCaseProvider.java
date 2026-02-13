package Homework_week3;

import java.util.ArrayList;
import java.util.List;

public class TestCaseProvider {

    TestCase BUILD_MAX_HEAP_TEST_CASE = new TestCase(
        new ArrayList<>(List.of(
                new WordFrequency("happy", 400),
                new WordFrequency("satisfied", 100),
                new WordFrequency("neutral", 300),
                new WordFrequency("would buy again", 200),
                new WordFrequency("terrible", 160),
                new WordFrequency("inconvenient", 900),
                new WordFrequency("difficult to use", 100),
                new WordFrequency("easy to use", 140),
                new WordFrequency("would recommend to friends", 800),
                new WordFrequency("visit the store", 700)
            )),
            new ArrayList<>(List.of(
                    new WordFrequency("inconvenient", 900),
                    new WordFrequency("would recommend to friends", 800),
                    new WordFrequency("happy", 400),
                    new WordFrequency("would buy again", 200),
                    new WordFrequency("visit the store", 700),
                    new WordFrequency("neutral", 300),
                    new WordFrequency("satisfied", 100),
                    new WordFrequency("easy to use", 140),
                    new WordFrequency("difficult to use", 100),
                    new WordFrequency("terrible", 160)
            ))
    );
}
