package classandinterface;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ComplexTest {

    @Test
    void test() {
        Complex expected = new Complex(30, 5);
        Complex minuend = new Complex(40, 6);
        Complex subtrahend = new Complex(10, 1);
        Complex result = minuend.minus(subtrahend);

        assertThat(result).isEqualTo(expected);
    }
}