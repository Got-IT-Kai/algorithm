package dev.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LeetCode1249Test {

    private final LeetCode1249 solution = new LeetCode1249();

    @ParameterizedTest
    @MethodSource("testCases")
    void minRemoveToMakeValid(String str, String expected) {
        String actual = solution.minRemoveToMakeValid(str);
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("lee(t(c)o)de)", "lee(t(c)o)de"),
                Arguments.of("a)b(c)d", "ab(c)d"),
                Arguments.of("))((", ""));
    }

}