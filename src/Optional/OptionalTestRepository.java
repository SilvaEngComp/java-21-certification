package Optional;

import Optional.domain.Manga;
import Optional.infrastructure.MangaRepository;

import java.util.Optional;

public class OptionalTestRepository {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findBy(m->m.getTitle().equalsIgnoreCase("Naruto"));
        mangaByTitle.ifPresent(m->m.setTitle("Naruto 2"));
        System.out.println(mangaByTitle);
    }
}
