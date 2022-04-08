import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public abstract class playlist {
    //Contains methods and attributes used in all playlist subclasses
    private final Queue<song> songQueue = new LinkedList<song>();
    private final ArrayList<song> songList = new ArrayList<song>();

    private song currentSong;
    private boolean isPlaying;

    public void addSong(song s){
        // Trey 
    }

    public void removeSong(song s){
        // Trey
    }
    
    public void playSong(String songName){
        // Trey
    }

    public void queueSong(String songName){
        //Find song that matches songName and adds to Queue
        for(song Song: songList){
            if (Song.getTitle().equals(songName)){
                songQueue.add(Song);
                return;
            }
        }
        System.out.println("ERROR: Didn't find song to queue");
    }

    public void togglePlayPause(){
        isPlaying = !isPlaying;
    }

    public void skip(){
        songQueue.remove();

        //If there isn't another item in queue then stop
        if(songQueue.peek() == null){
            isPlaying = false;
            return;
        }else
            currentSong = songQueue.peek();
    }

    public void shuffle(){
        //Converts songQueue to List and shuffles
        List<song> sList = (List) songQueue;
        Collections.shuffle(sList);

        //Clears playlist and adds shuffled songs
        songQueue.clear();
        for(song s: sList){
            songQueue.add(s);
        }
    }
    
    public abstract String getInfo();
}
