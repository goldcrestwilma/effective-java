package generic;

import java.util.function.UnaryOperator;

import org.junit.jupiter.api.Test;

class GenericSingletonFactoryTest {

    @Test
    void testFunctionIdentity() {
        String[] strings = {"abc", "apple", "google"};
        UnaryOperator<String> sameString = GenericSingletonFactory.identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = GenericSingletonFactory.identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }
}