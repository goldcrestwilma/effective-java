package generic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StackTest {

    @ParameterizedTest
    @MethodSource(value = "parameters")
    void testGenericStack(List<String> strings, List<String> expected) {
        Stack<String> stack = new Stack<>();
        strings.forEach(stack::push);

        while (!stack.isEmpty()) {
            assertThat(expected).contains(stack.pop().toUpperCase());
        }
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
            Arguments.of(List.of("apple", "nvidia"), List.of("APPLE", "NVIDIA"))
        );
    }


}