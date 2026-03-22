package methodReference;

import methodReference.domain.Anime;
import methodReference.domain.interfaces.ContructorMultipleEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class MethodConstructorReferenceTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto Classico", 9), new Anime("Bleach", 2),new Anime("Window Breaker", 3)));


        BiFunction<String,Integer,Anime> animeBiFunction = Anime::new;
        animes.sort(Anime::compareTo);

        ContructorMultipleEntry<Anime> multipleEntry = Anime::new;

        System.out.println(multipleEntry.multipleEntrisConstructor("One Punch",3));

        System.out.println(animes);
    }
}
