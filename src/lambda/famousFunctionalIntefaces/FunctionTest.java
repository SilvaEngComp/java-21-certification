package lambda.famousFunctionalIntefaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        List<List<String>> pages = List.of(List.of("item 1 - page 1","item 2 - page 1"),List.of("item 1 - page 2","item 2 - page 2"));

        for(Integer item: functionTest(pages, List::size)){
            System.out.println(item);
        }
    }

    public static <T,R> List<R> functionTest(List<T> values, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T t: values){
           R r = function.apply(t);
           result.add(r);
        }

        return result;
    }
}
