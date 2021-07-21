package generic;

import java.util.HashSet;
import java.util.Set;

public class SetUtility {

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        var result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
