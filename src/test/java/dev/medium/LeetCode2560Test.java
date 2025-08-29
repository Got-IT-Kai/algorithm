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
                Arguments.of(new int[]{2, 3, 5, 9}, 2, 0)
        );
    }
}
