package methodReference;

import methodReference.domain.Anime;
import methodReference.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodNonStaticReferenceTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto Classico", 9), new Anime("Bleach", 2),new Anime("Window Breaker", 3)));


        animes.sort(new AnimeComparators()::compareBySeasonsNonStatic);

        System.out.println(animes);
    }
}
