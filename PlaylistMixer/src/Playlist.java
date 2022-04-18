import java.util.Queue;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Arrays;

 public abstract class Playlist {
     //Contains methods and attributes used in all playlist subclasses
     private final Queue<Song> songQueue = new LinkedList<Song>();
     private final ArrayList<Song> songList = new ArrayList<Song>();

     private Song currentSong;

     private boolean isPlaying;

     public void print(){
        System.out.println("PLAYLIST:");
        for(Song s:songList){
            System.out.println(
            s.getTitle() +
            " by " + s.getArtist() +
            " -- " +
            " Genre: " + s.getGenre());
        }
     }
     public void addSong(Song s){
         if(songList.contains(s)){
            System.out.println("The song \"" + s.getTitle() + "\" by " + s.getArtist() + " is already in your playlist");
         }
         else{
             songList.add(s);
             System.out.println("The song \"" + s.getTitle() + "\" by " + s.getArtist() + " is now in your playlist");
         }

     }

     public void removeSong(String s){
         for(int i = 0; i < songList.size(); i++){
            Song iter = songList.get(i);
            if(iter.getTitle().equals(s)){
               System.out.println("The song \"" + iter.getTitle() + "\" by " + iter.getArtist() + " is removed from the playlist");
               songList.remove(i);
               return;
            }
        }
        System.out.println("This song is not in your playlist");
     }

     public void playSong(String songName){
         
         for(int i = 0; i < songList.size(); i++){
             Song iter = songList.get(i);
             if(iter.getTitle().equals(songName)){
                System.out.println("The song \"" + iter.getTitle() + "\" by " + iter.getArtist() + " is now playing");
                currentSong = iter;
                isPlaying = true;
                return;
             }
         }
        System.out.println("Could not find song in playlist");
     }

     public void queueSong(String songName){
        if(!isPlaying){ // If there is not a song playing, that queued song plays the queued song
            this.playSong(songName);
            return;
        }
        //Find song that matches songName and adds to Queue
         for(Song Song: songList){
             if (Song.getTitle().equals(songName)){
                 songQueue.add(Song);
                 System.out.println("The song has been added to the queue");
                 return;
             }
         }
         System.out.println("ERROR: Didn't find song to queue");
     }

     public void togglePlayPause(){
        if(currentSong == null){
            System.out.println("There is no song playing");
            return;
         }
        isPlaying = !isPlaying;
        if(isPlaying == false){
            System.out.println("Paused: \"" + currentSong.getTitle() + "\" by " + currentSong.getArtist());
         }
        else{
            System.out.println("Playing: \"" + currentSong.getTitle() + "\" by " + currentSong.getArtist());
         }
     }

     public void skip(){
        if(isPlaying){
            System.out.println("No longer playing...\"" + currentSong.getTitle() + "\" by " + currentSong.getArtist());
            isPlaying = false;
        }
        else{
            System.out.println("There is no song playing!");
            return;
        }

        if(songQueue.isEmpty()){
            System.out.println("Your queue is empty!");
            isPlaying = false;
            return;
        } 
        currentSong = songQueue.remove();

         //If there isn't another item in queue then stop

        System.out.println("Now playing...\"" + currentSong.getTitle() + "\" by " + currentSong.getArtist());
        isPlaying = true;
     }

     public void shuffle(){
        System.out.println("Shuffling...");
        Song sa[] = new Song[songList.size()];
        sa = songList.toArray(sa);

        songQueue.clear(); // Clears the previous queue
        
        
         //Converts songQueue to List and shuffles
         List<Song> sList = Arrays.asList(sa);
         Collections.shuffle(sList);

         //Clears playlist and adds shuffled songs
         
         for(Song s: sList){
             songQueue.add(s);
         }
         this.skip();
     }

     public abstract String getInfo();

    }