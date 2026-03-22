package methodReference;

import methodReference.domain.Anime;
import methodReference.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodStaticReferenceTest {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto Classico", 9), new Anime("Bleach", 2),new Anime("Window Breaker", 3)));

//        Collections.sort(animes, AnimeComparators::compareByTitle);
        Collections.sort(animes, AnimeComparators::compareBySeasons);

        Collections.sort(animes, AnimeComparators::compareBySeasons);

        System.out.println(animes);
    }
}
