package stream;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExtractorTest {

    private Extractor extractor;

    @BeforeEach
    void setUp() {
        extractor = new Extractor();
        String input = "a b c G h k i K a b j e R v N d c o p b D f k g E G I A x f r e d c v b g q a w s e d z c d f v g b";
        extractor.createWords(input);
    }

    @Test
    void testCollectorSortedReverse() {
        var list = extractor.getTopTen();

        assertThat(list.get(2)).isEqualTo("g");
    }
}