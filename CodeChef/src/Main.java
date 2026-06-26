import java.util.Scanner;

// Define the Song class here
class Song{
    protected String title;
    protected String artist;

    Song(String title,String artist){
        this.title = title;
        this.artist = artist;
    }
}
// Define the Playlist class here
class Playlist{
    ArrayList<Song> s = new ArrayList<>();

    public void addSong(String songName){
        s.add(new Song(songName));
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSongs = Integer.parseInt(scanner.nextLine());

        // Create a Playlist object



        for (int i = 0; i < numSongs; i++) {
            String title = scanner.nextLine();
            String artist = scanner.nextLine();
            // Create a Song object and add it to the playlist



        }

        myPlaylist.display();



        scanner.close();
    }
}