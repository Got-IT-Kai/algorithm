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
                Arguments.of(new int[]{1, 3, 5, 1}, 2, 0L)
        );
    }
}