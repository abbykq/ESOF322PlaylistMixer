import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public abstract class playlist {
    //Contains methods and attributes used in all playlist subclasses
    private final Queue<song> songQueue = new LinkedList<song>();
    private final ArrayList<song> songList = new ArrayList<song>();

    private song currentSong;
    private boolean isPlaying;

    public void addSong(song s){

    }

    public void removeSong(song s){

    }
    
    public void playSong(String songName){

    }

    public void queueSong(String songName){

    }

    public void togglePlayPause(){
        isPlaying = !isPlaying;
    }

    public void skip(){

    }

    public void shuffle(){

    }
    
    public String getInfo(){
        return "";
    }
}
