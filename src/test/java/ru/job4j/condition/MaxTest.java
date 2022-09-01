package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax5To2To4To9Then9() {
        int left = 5;
        int right = 2;
        int first = 4;
        int second = 9;
        int result = Max.max(left, right, first, second);
        int expected = 9;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenMax2To7To55Then55() {
        int left = 2;
        int right = 7;
        int second = 55;
        int result = Max.max(left, right, second);
        int expected = 55;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);

    }
}


