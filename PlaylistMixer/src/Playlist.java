import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public abstract class Playlist {
    //Contains methods and attributes used in all playlist subclasses
    private final Queue<Song> songQueue = new LinkedList<Song>();
    private final ArrayList<Song> songList = new ArrayList<Song>();

    private Song currentSong;
    private boolean isPlaying;

    public void addSong(Song s){
        // Trey 
    }

    public void removeSong(Song s){
        // Trey
    }
    
    public void playSong(String songName){
        // Trey
    }

    public void queueSong(String songName){
        //Find song that matches songName and adds to Queue
        for(Song Song: songList){
            if (Song.getTitle().equals(songName)){
                songQueue.add(Song);
                return;
            }
        }
        System.out.println("ERROR: Didn't find song");
    }

    public void togglePlayPause(){
        isPlaying = !isPlaying;
    }

    public void skip(){

    }

    public void shuffle(){

    }
    
    public abstract String getInfo();
}
