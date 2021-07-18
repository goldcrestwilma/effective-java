package stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;
import static java.util.stream.Collectors.toList;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class MersennePrime {

    private MersennePrime() {

    }

    public static List<BigInteger> createMersennePrime(int certainty) {
        return primes().map(prime -> TWO.pow(prime.intValueExact()).subtract(ONE))
                       .filter(mersenne -> mersenne.isProbablePrime(certainty))
                       .limit(20)
                       .collect(toList());
    }

    private static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
}
