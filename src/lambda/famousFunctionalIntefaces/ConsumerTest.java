package lambda.famousFunctionalIntefaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerTest {

    public static void main(String[] args) {
        List<String> pages = List.of("item 1 page 1", "item 2 page 1","item 1 page 2","item 2 page 2");
        consumerTest(pages, System.out::println);
    }

    public static <T> void consumerTest(List<T> list, Consumer<T> consumer){
        for(T item: list){
            consumer.accept(item);
        }
    }
}
