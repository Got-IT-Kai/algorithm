package dev.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode2560Test {

    private static final LeetCode2560 leetCode2560 = new LeetCode2560();

    @ParameterizedTest
    @MethodSource("testCases")
    void minCapability(int[] nums, int k, int expected) {
        int actual = leetCode2560.minCapability(nums, k);
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 5, 9}, 2, 5),
                Arguments.of(new int[]{2, 7, 9, 3, 1}, 2, 2),
                Arguments.of(new int[]{3, 1, 4, 1, 5, 9}, 2, 1),
                Arguments.of(new int[]{10, 2, 8, 5}, 1, 2),
                Arguments.of(new int[]{2, 7, 9, 3, 1}, 3, 9),
                Arguments.of(new int[]{100, 1, 100, 1, 100}, 2, 1),
                Arguments.of(new int[]{100, 1, 100, 1, 100}, 3, 100),
                Arguments.of(new int[]{7, 7, 7, 7, 7, 7, 7}, 3, 7),
                Arguments.of(new int[]{1, 100, 2, 200, 3, 300, 4}, 4, 4)
        );
    }
}
