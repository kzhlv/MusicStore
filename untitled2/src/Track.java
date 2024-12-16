// Track.java
public class Track {
    private String title;
    private String artist;
    private int releaseYear;
    private String genre;

    public Track(String title, String artist, int releaseYear, String genre) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s by %s (%d) - Genre: %s", title, artist, releaseYear, genre);
    }
}