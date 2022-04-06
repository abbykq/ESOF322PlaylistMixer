public class song {
    //Holds title, genre, and artist to be stored in playlist

    private final String title, artist, genre;

    song(String t, String a, String g){
        title = t;
        artist = a;
        genre = g;
    }

    public String getTitle(){ return title;}

    public String getArtist(){ return artist;}

    public String getGenre(){ return genre;}
    
}
