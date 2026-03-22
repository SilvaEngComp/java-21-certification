package Optional.infrastructure;

import Optional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
private static List<Manga> mangas = List.of(new Manga(1,"Boku no hero", 50), new Manga(2,"Naruto", 900), new Manga(3,"Window Breaker", 40));

    public static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for(Manga manga: mangas){
            if(predicate.test(manga)){
               found = manga;
               break;
            }
        }
        return Optional.of(found);
    }
}
