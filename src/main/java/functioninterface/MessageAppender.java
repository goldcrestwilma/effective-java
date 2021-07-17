package functioninterface;

import java.util.function.Function;

public class MessageAppender {

    public String append(int numeric) {
        return addString().apply(numeric);
    }

    private Function<Integer, String> addString() {
        return numeric -> "input number is: " + numeric;
    }
}
