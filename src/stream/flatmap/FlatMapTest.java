package stream.flatmap;

import java.util.Collection;
import java.util.List;

public class FlatMapTest {
    public static void main(String[] args) {
        List<List<String>> pages = List.of(List.of("item 1 - page 1","item 2 - page 1"),List.of("item 1 - page 2","item 2 - page 2"));
        pages.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
