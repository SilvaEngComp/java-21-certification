package lambda.famousFunctionalIntefaces;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args){
        predicateTest("casac", ((String s)->s.endsWith("c")));
    }

    public static <T> void predicateTest(T value, Predicate<T> predicate){
        if(predicate.test(value)){
            System.out.println(value);
        }else{
            System.out.println("not ends with c");
        }
    }
}
