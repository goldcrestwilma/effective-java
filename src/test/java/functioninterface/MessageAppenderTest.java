package functioninterface;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MessageAppenderTest {

    @Test
    void testAppend() {
        // given
        String expected = "input number is: 10";

        // when
        MessageAppender messageAppender = new MessageAppender();
        String actual = messageAppender.append(10);

        // then
        assertThat(expected).isEqualTo(actual);
    }
}