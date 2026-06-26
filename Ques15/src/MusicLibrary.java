import java.util.ArrayList;

public class MusicLibrary {
//    Write a Java program to create a class called "MusicLibrary" with
//    a collection of songs and methods to add and remove songs, and to play a random song.
    class Song{
        private int songId;
        private String title;
        private String singerName;
        Song(String title, String singerName, int id){
            this.title = title;
            this.singerName = singerName;
            this.songId  = id;
        }

    public int getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

    public String getSingerName() {
        return singerName;
    }

}
    private ArrayList<Song> songs  = new ArrayList<>();
    public void addSong(String newSong, String newSinger, int id){
        songs.add(new Song(newSong,newSinger,id));
    }
    public void removeSong(int newSongId){

        songs.removeIf(song->newSongId == song.getSongId());
        }

    public void getSong(){
        for(MusicLibrary.Song song: songs) {
            System.out.println(song.songId+" "+song.title+" "+ song.singerName);
        }
    }
    public void playRandomSong(){
       int index =  (int)(Math.random() * songs.size());
        if(songs.isEmpty()){
            System.out.println("No songs avaliable to play");
        }else{
            MusicLibrary.Song song = songs.get(index);
            System.out.println(song.title +"is playing now");
        }
    }
}
