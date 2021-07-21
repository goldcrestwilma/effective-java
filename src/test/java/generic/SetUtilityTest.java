package generic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.jupiter.api.Test;

class SetUtilityTest {

    @Test
    void testUnion() {
        // given
        Set<String> reptiles = Set.of("crocodile", "lizard", "snake");
        Set<String> birds = Set.of("eagle", "hawk");

        // when
        Set<String> animals = SetUtility.union(reptiles, birds);

        // then
        assertThat(animals).containsAnyElementsOf(reptiles).containsAnyElementsOf(birds);
    }
}