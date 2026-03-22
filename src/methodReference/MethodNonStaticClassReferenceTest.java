package methodReference;

import methodReference.domain.Anime;
import methodReference.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodNonStaticClassReferenceTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto Classico", 9), new Anime("Bleach", 2),new Anime("Window Breaker", 3)));


        animes.sort(Anime::compareTo);

        System.out.println(animes);
    }
}
