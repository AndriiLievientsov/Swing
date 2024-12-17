package DifPakcage;

public class Song extends Item {
    private Genre genre;

    public Song(String name, Genre genre) {
        super(name);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song name: " + getName() + ", Genre: " + genre;
    }
}