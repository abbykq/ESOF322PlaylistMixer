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
        if(songList.contains(s)){
            System.out.println("The song is already in the playlist");
        }
        else{
            songList.add(s);
        }
        
    }

    public void removeSong(song s){
        if(songList.contains(s)){
            songList.remove(s);
        }
        else{
            System.out.println("This song is not in this playlist");
        }
    }
    
    public void playSong(String songName){
        for(int i = 0; i < songList.size(); i++){
            
        }
    }

    public void queueSong(String songName){
        //Find song that matches songName and adds to Queue
        for(song Song: songList){
            if (Song.getTitle().equals(songName)){
                songQueue.add(Song);
                break;
            }
        }
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
