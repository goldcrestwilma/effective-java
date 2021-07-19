package stream;

import static java.util.stream.Collectors.toMap;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperationTest {

    @DisplayName("더하기 ~")
    @Test
    void testAddition() {
        // given
        double augend = 10;
        double addend = 5;
        double expectedResult = 15;

        // when
        double actualResult = Operation.PLUS.apply(augend, addend);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @DisplayName("빼기 ~")
    @Test
    void testSubtraction() {
        // given
        double minuend = 10;
        double subtrahend = 5;
        double expectedResult = 5;

        // when
        double actualResult = Operation.MINUS.apply(minuend, subtrahend);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @DisplayName("곱하기 ~")
    @Test
    void testMultiplication() {
        // given
        double multiplicand = 10;
        double multiplier = 5;
        double expectedResult = 50;

        // when
        double actualResult = Operation.TIMES.apply(multiplicand, multiplier);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @DisplayName("나누기 ~")
    @Test
    void testDivision() {
        // given
        double dividend = 10;
        double divisor = 5;
        double expectedResult = 2;

        // when
        double actualResult = Operation.DIVIDE.apply(dividend, divisor);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void testToMap() {
        Map<String, Operation> stringToEnum = Stream.of(Operation.values())
                                                    .filter(o -> o.name().length() > 4)
                                                    .collect(toMap(Object::toString, Function.identity()));
        System.out.println(stringToEnum);

        assertThat(stringToEnum).hasSize(3)
                                .containsEntry(Operation.DIVIDE.name(), Operation.DIVIDE)
                                .doesNotContainEntry(Operation.PLUS.name(), Operation.PLUS);
    }

}
