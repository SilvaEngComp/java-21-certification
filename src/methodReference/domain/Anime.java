package methodReference.domain;

public class Anime implements Comparable<Anime>{
    private String title;
    private  Integer seasons;

    public Anime(String title, Integer seasons) {
        this.title = title;
        this.seasons = seasons;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", seasons=" + seasons +
                '}';
    }

    @Override
    public int compareTo(Anime outroAnime) {
        return this.getTitle().compareTo(outroAnime.getTitle());
    }
}
