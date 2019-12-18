package problem2;

import java.io.FileWriter;
import java.io.IOException;

public class HW32 {
    public static void main(String[] args) throws IOException {
        Song song = new Song("Perfect", "Ed Sheeran", "I found a love for me\n" +
                "Darling just dive right in\n" +
                "And follow my lead\n" +
                "Well I found a girl beautiful and sweet\n" +
                "I never knew you were the someone waiting for me\n" +
                "'Cause we were just kids when we fell in love\n" +
                "Not knowing what it was\n" +
                "I will not give you up this time\n" +
                "But darling, just kiss me slow, your heart is all I own\n" +
                "And in your eyes you're holding mine\n" +
                "Baby, I'm dancing in the dark with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "When you said you looked a mess, I whispered underneath my breath\n" +
                "But you heard it, darling, you look perfect tonight\n" +
                "Well I found a woman, stronger than anyone I know\n" +
                "She shares my dreams, I hope that someday I'll share her home\n" +
                "I found a love, to carry more than just my secrets\n" +
                "To carry love, to carry children of our own\n" +
                "We are still kids, but we're so in love\n" +
                "Fighting against all odds\n" +
                "I know we'll be alright this time\n" +
                "Darling, just hold my hand\n" +
                "Be my girl, I'll be your man\n" +
                "I see my future in your eyes\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "When I saw you in that dress, looking so beautiful\n" +
                "I don't deserve this, darling, you look perfect tonight\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "I have faith in what I see\n" +
                "Now I know I have met an angel in person\n" +
                "And she looks perfect\n" +
                "I don't deserve this\n" +
                "You look perfect tonight", "Pop-Music");

        FileWriter fileWriter = new FileWriter("Perfect.txt");
        fileWriter.write(song.getName() + "\n");
        fileWriter.write(song.getGenre() + "\n");
        fileWriter.write(song.getPerformer() + "\n");
        fileWriter.write(song.getLyrics() + "\n");

        fileWriter.close();
    }
}

class Song {
    private String name;
    private String performer;
    private String lyrics;
    private String genre;

    public Song() {
    }

    public Song(String name, String performer, String lyrics, String genre) {
        this.name = name;
        this.performer = performer;
        this.lyrics = lyrics;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
