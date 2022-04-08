public class genrePlaylist extends Playlist {
    //This is a playlist that only contains one genre 
    private final String genre;

    genrePlaylist(String g){
        genre = g;
    }

    @Override
    public String getInfo(){
        return "This playlist is built based on Genre: " + genre;
    }
}
