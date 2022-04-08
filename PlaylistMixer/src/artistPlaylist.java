public class artistPlaylist extends playlist{
    //This is a playlist that only contains one artist 
    private final String artist;

    artistPlaylist(String a){
        artist = a;
    }

    public String getInfo(){
        return "This playlist is built based on Artist: " + artist;
    }
}
