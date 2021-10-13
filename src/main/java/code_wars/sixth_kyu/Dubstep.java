package code_wars.sixth_kyu;

public class Dubstep {

    public String songDecoder(String song) {
        song = song.replace("WUB", " ");
        song = song.trim();
        while (song.contains("  ")) song = song.replace("  ", " ");
        return song;
    }
}
