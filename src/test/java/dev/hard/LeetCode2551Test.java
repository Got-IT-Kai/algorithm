package dev.hard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode2551Test {

    private final LeetCode2551 solution = new LeetCode2551();

    @ParameterizedTest
    @MethodSource("testCases")
    void putMarbles(int[] weights, int k, long expected) {
        assertThat(solution.putMarbles(weights, k)).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 1}, 2, 4L),
                Arguments.of(new int[]{1, 3}, 2, 0L),
                Arguments.of(new int[]{1, 3, 5, 1, 2, 8, 4, 3}, 3, 15L),
                Arguments.of(new int[]{1, 3, 5, 1}, 4, 0L),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 3, 0L),
                Arguments.of(new int[]{10, 20, 30}, 1, 0L),
                Arguments.of(new int[]{10, 20, 30}, 2, 20L)
        );
    }
}