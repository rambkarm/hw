package hw.collections;

import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        List<String> lala = new ArrayList<>
                (Arrays.asList("sasha", "pasha", "masha", "dasha"));
        System.out.println(lala);
        lala.add(0, "natasha");
        System.out.println(lala);
    }
}
