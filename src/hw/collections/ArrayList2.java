package hw.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>
        (Arrays.asList("a", "b", "c", "d"));
        for (String element : letters) {
            System.out.println(element);
        }
    }
}
