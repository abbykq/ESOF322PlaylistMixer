import java.util.Scanner;
import java.util.*;
public class Main {

    // LIST OF SONGS
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
        basic1.removeSong((Song) songs.get(11));

    }

    public static void test2(List songs){
        System.out.println("Genre Playlist");
        genrePlaylist genre1 = new genrePlaylist("Pop");

    }

    public static void test3(List songs){
        System.out.println("Artist Playlist");
        artistPlaylist artist1 = new artistPlaylist("DrDog");
    }

    public static void main(String[] args){

        List songs = songList();
        test1(songs);
        test2(songs);
        test3(songs);

//        System.out.println("Welcome to Playlist mixer");
//        System.out.println("Choose from the options below to continue");
//
//        System.out.println(" " +
//                "Play/Pause:           p\n " +
//                "Add Song to Playlist: a\n" +
//                " Remove Song:          r\n" +
//                " Add to Queue:         q\n" +
//                " Skip:                 n\n" +
//                " Shuffle:              s\n" +
//                " Get song info:        i\n" +
//                " End session:          e\n");
//
//        Scanner input = new Scanner(System.in);
//        String selection = "";
//        do{
//            System.out.print("Enter selection: ");
//            selection = input.nextLine();
//            // TODO add if selection = "a"...
//        }while(selection != "e");

    }
}

