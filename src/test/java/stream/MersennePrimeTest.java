package stream;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import java.util.List;

import org.junit.jupiter.api.Test;

class MersennePrimeTest {

    @Test
    void test() {
        List<BigInteger> list = MersennePrime.createMersennePrime(50);

        list.forEach(mp -> System.out.println(mp.bitLength() + ": " + mp));

        assertThat(list.get(5)).isEqualTo(131071);
    }
}