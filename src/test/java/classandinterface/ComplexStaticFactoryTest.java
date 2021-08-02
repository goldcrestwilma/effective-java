package classandinterface;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ComplexStaticFactoryTest {

    @Test
    void test() {
        ComplexStaticFactory expected = ComplexStaticFactory.valueOf(30, 5);
        ComplexStaticFactory minuend = ComplexStaticFactory.valueOf(40, 6);
        ComplexStaticFactory subtrahend = ComplexStaticFactory.valueOf(10, 1);
        ComplexStaticFactory result = minuend.minus(subtrahend);

        assertThat(result).isEqualTo(expected);
    }
}