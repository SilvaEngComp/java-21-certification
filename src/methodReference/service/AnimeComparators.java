package methodReference.service;

import methodReference.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime anime1, Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public static int compareBySeasons(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getSeasons(),anime2.getSeasons());
    }

    public  int compareBySeasonsNonStatic(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getSeasons(),anime2.getSeasons());
    }
}
