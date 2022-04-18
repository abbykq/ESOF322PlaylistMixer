import java.util.Scanner;
import java.util.*;
public class Main {

    // SAMPLE SONG DATABASE
    public static List songList(){
        // for genre playlist Pop
        Song Good4You= new Song("good 4 you", "Olivia Rodrigo", "Pop");
        Song SevenRings = new Song("7SevenRings", "Arianna Grande", "Pop");
        Song Photograph = new Song("Photograph", "Ed Sheeran", "Pop");
        Song AsItWas= new Song("As It Was", "Harry Styles", "Pop");
        Song BlankSpace = new Song("Blank Space", "Taylor Swift", "Pop");
        // for artist playlist Dr.Dog
        Song TheBreeze= new Song("The Breeze", "DrDog", "Alt/Indie");
        Song Nellie= new Song("Nellie", "DrDog", "Alt/Indie");
        Song ShadowPeople= new Song("Shadow People", "DrDog", "Alt/Indie");
        Song HeartItRaces= new Song("Heart It Races", "DrDog", "Alt/Indie");
        Song AbandonedMansion = new Song("Abandonded Mansion", "DrDog", "Alt/Indie");
        // random songs
        Song AtLast= new Song("At Last", "Etta James", "Jazz");
        Song Sandstorm= new Song("Sandstorm", "Darude", "EDM");
        Song Kids = new Song("Kids", "Current Joys", "Alt/Indie");
        Song IMissYou= new Song("I Miss You", "Blink182", "Punk Rock");
        Song Yellow= new Song("Yellow", "Coldplay", "Alt/Rock");
        Song ChopSuey= new Song("Chop Suey!", "System Of A Down", "Metal");
        Song SchoolsOut= new Song("School's Out", "Alice Cooper", "Rock");
        Song Utah= new Song("Utah", "Brotherkenzie", "Folk");
        Song MrMom= new Song("Mr. Mom", "Lonestar", "Country");
        Song SameDrugs = new Song("Same Drugs", "Chance The Rapper", "Rap");
        // Song AroundTheWorld = new Song("Around the World", "Daft Punk", "EDM");
        // Song ILoveYouSo= new Song("I Love You So", "The Walters", "Alt/Indie");
        // Song BasketCase= new Song("Basket Case", "Green Day", "Punk Rock");
        // Song MrBrightSide= new Song("Mr. Brightside", "The Killers", "Alt/Rock");
        //Song BringMeToLife= new Song("Bring Me To Life", "Evanescence", "Metal");
        //Song StairWayToHeaven= new Song("Stairway To Heaven", "Led Zeppelin", "Rock");
        //Song ByAndBy= new Song("By and By", "Caamp", "Folk");
        //Song LOVE= new Song("LOVE", "Nat King Cole", "Jazz");
        //Song InternationalHarvester= new Song("International Harvester", "Craig Morgan", "Country");

        List songs = new ArrayList<>();
        songs.add(Good4You);
        songs.add(SevenRings);
        songs.add(Photograph);
        songs.add(AsItWas);
        songs.add(BlankSpace);
        songs.add(TheBreeze);
        songs.add(Nellie);
        songs.add(ShadowPeople);
        songs.add(HeartItRaces);
        songs.add(AbandonedMansion);
        songs.add(AtLast);
        songs.add(Sandstorm);
        songs.add(Kids);
        songs.add(IMissYou);
        songs.add(Yellow);
        songs.add(ChopSuey);
        songs.add(SchoolsOut);
        songs.add(Utah);
        songs.add(MrMom);
        songs.add(SameDrugs);
        return songs;
    }

    public static void test1(List songs){
        System.out.println("Basic Playlist");
        basicPlaylist basic1 = new basicPlaylist();
        basic1.addSong((Song) songs.get(10));
        basic1.addSong((Song) songs.get(10));
        //basic1.removeSong(songs.get(11).);

    }

    public static void test2(List songs){
        System.out.println("Genre Playlist");
        genrePlaylist genre1 = new genrePlaylist("Pop");

    }

    public static void test3(List songs){
        System.out.println("Artist Playlist");
        artistPlaylist artist1 = new artistPlaylist("DrDog");
    }

    public static void printOptions(){
        System.out.println(" " +
                "Play/Pause:                  play or pause\n " +
                "Play Specific Song:          play song\n " +
                "Add Song to Playlist:        add\n" +
                " Remove Song From Playlist:   remove\n" +
                " Add to Queue:                queue\n" +
                " Skip Current Song:           skip\n" +
                " Shuffle Queue:               shuffle\n" +
                " Get song info:               info\n" +
                " Print Playlist:              print\n" +
                " Print Options again:         options\n" +
                " End session:                 end\n");
    }
    public static void main(String[] args){

//        List songs = songList();
//        test1(songs);
//        test2(songs);
//        test3(songs);

        Playlist userPlaylist = null;

        System.out.println("Welcome to Playlist mixer");
        System.out.println("What type of playlist would you like to make? Choose from Basic, Genre, Artist: ");
        Scanner playlistTypeInput = new Scanner(System.in);
        String playlistType = playlistTypeInput.nextLine();
        if(playlistType.equals("Basic")){
            userPlaylist = new basicPlaylist();
        }
        if(playlistType.equals("Genre")){
            Scanner genreInput = new Scanner(System.in);
            System.out.println("What type of genre? ");
            String genre= genreInput.nextLine();
            userPlaylist = new genrePlaylist(genre);
            List songs = songList();
            for (int i = 0; i < songs.size() ; i++ ){
                System.out.println();
            }

        }
        if(playlistType.equals("Artist")){
            Scanner artistInput = new Scanner(System.in);
            System.out.println("What artist? ");
            String artist = artistInput.nextLine();
            userPlaylist = new artistPlaylist(artist);
        }

        System.out.println("Choose from the options below to continue");

        printOptions();

        Scanner input = new Scanner(System.in);
        String selection = "";
        do{
            System.out.print("Enter selection: ");
            selection = input.nextLine();
            // TODO add if selection = "a"...
            if (selection.equals("play") || selection.equals("pause")){
                userPlaylist.togglePlayPause();
            }
            else if (selection.equals("play song")){
                Scanner toPlayInput = new Scanner(System.in);
                System.out.print("Which song? ");
                String toPlay = toPlayInput.nextLine();
                userPlaylist.playSong(toPlay);
            }
            else if (selection.equals("add")){
                Scanner songTitleInput = new Scanner(System.in);
                Scanner songArtistInput = new Scanner(System.in);
                Scanner songGenreInput = new Scanner(System.in);
                System.out.print("Title of song: ");
                String title = songTitleInput.nextLine();
                System.out.print("Artist of song: ");
                String artist = songArtistInput.nextLine();
                System.out.print("Genre of song: ");
                String genre = songGenreInput.nextLine();
                Song newSong = new Song(title, artist, genre);
                userPlaylist.addSong(newSong);
            }
            else if (selection.equals("remove")){
                Scanner toRemoveInput = new Scanner(System.in);
                String toRemove = toRemoveInput.nextLine();
                userPlaylist.removeSong(toRemove);
            }
            else if (selection.equals("queue")){

            }
            else if (selection.equals("skip")){
                userPlaylist.skip();
            }
            else if (selection.equals("shuffle")){
                userPlaylist.shuffle();
            }
            else if (selection.equals("info")){

            }
            else if (selection.equals("print")){
                userPlaylist.print();
            }
            else if (selection.equals("options")){
                printOptions();
            }
        }while(!selection.equals("end"));

        System.exit(0);
    }
}

