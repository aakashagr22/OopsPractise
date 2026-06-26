//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Write a Java program to create a class called "MusicLibrary" with a collection of songs
//    and methods to add and remove songs, and to play a random song.
MusicLibrary ml  = new MusicLibrary();
//MusicLibrary.Song song =
    ml.addSong("Saaki Sakki", "Badshah",1);
    ml.addSong("Mujhse shadi karogi", "Sonu Nigam",2);
    ml.addSong("devdas", "Udit Narayan",3);
    ml.addSong("mahiyan", "Ayushman",4);
    ml.getSong();
    ml.removeSong(4);
    ml.playRandomSong();
    ml.getSong();
}
