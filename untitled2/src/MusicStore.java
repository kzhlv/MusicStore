// MusicStore.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicStore {
    private List<Track> tracks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void initStore() {
        tracks.add(new Track("Imagine", "John Lennon", 1971, "Pop"));
        tracks.add(new Track("Bohemian Rhapsody", "Queen", 1975, "Rock"));
        tracks.add(new Track("Shape of You", "Ed Sheeran", 2017, "Pop"));
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("\nWelcome to the Music Store!");
            System.out.println("1. Show all tracks");
            System.out.println("2. Search track by title");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> showAllTracks();
                case 2 -> searchTrackByTitle();
                case 3 -> System.out.println("Thank you for visiting!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    private void showAllTracks() {
        System.out.println("\nList of Tracks:");
        for (Track track : tracks) {
            System.out.println(track);
        }
    }

    private void searchTrackByTitle() {
        System.out.print("\nEnter track title to search: ");
        String title = scanner.nextLine();
        boolean found = false;

        for (Track track : tracks) {
            if (track.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Track found: " + track);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Track not found.");
        }
    }
}