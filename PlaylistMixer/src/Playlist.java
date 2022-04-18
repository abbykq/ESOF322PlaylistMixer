import java.util.Queue;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;

 public abstract class Playlist {
     //Contains methods and attributes used in all playlist subclasses
     private final Queue<Song> songQueue = new LinkedList<Song>();
     private final ArrayList<Song> songList = new ArrayList<Song>();

     private Song currentSong;

     private boolean isPlaying;

     public void addSong(Song s){
         // Trey 
         if(songList.contains(s)){
             System.out.println("The song is already in the playlist");
         }
         else{
             songList.add(s);
         }

     }

     public void removeSong(Song s){
         // Trey
         if(songList.contains(s)){
             songList.remove(s);
         }
         else{
             System.out.println("This song is not in this playlist");
         }
     }

     public void playSong(String songName){
         // Trey
         for(int i = 0; i < songList.size(); i++){

         }
     }

     public void queueSong(String songName){
         //Find song that matches songName and adds to Queue
         for(Song Song: songList){
             if (Song.getTitle().equals(songName)){
                 songQueue.add(Song);
                 break;
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
         List<Song> sList = (List) songQueue;
         Collections.shuffle(sList);

         //Clears playlist and adds shuffled songs
         songQueue.clear();
         for(Song s: sList){
             songQueue.add(s);
         }
     }

     public abstract String getInfo();

    }