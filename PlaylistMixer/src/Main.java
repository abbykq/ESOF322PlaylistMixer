import java.util.Scanner;

public class Main {
    // LIST OF SONGS
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
    Song LOVE= new Song("LOVE", "Nat King Cole", "Jazz");
    Song Sandstorm= new Song("Sandstorm", "Darude", "EDM");
    Song AroundTheWorld = new Song("Around the World", "Daft Punk", "EDM");
    Song ILoveYouSo= new Song("I Love You So", "The Walters", "Alt/Indie");
    Song Kids = new Song("Kids", "Current Joys", "Alt/Indie");
    Song BasketCase= new Song("Basket Case", "Green Day", "Punk Rock");
    Song IMissYou= new Song("I Miss You", "Blink182", "Punk Rock");
    Song MrBrightSide= new Song("Mr. Brightside", "The Killers", "Alt/Rock");
    Song Yellow= new Song("Yellow", "Coldplay", "Alt/Rock");
    Song BringMeToLife= new Song("Bring Me To Life", "Evanescence", "Metal");
    Song ChopSuey= new Song("Chop Suey!", "System Of A Down", "Metal");
    Song SchoolsOut= new Song("School's Out", "Alice Cooper", "Rock");
    Song StairWayToHeaven= new Song("Stairway To Heaven", "Led Zeppelin", "Rock");
    Song Utah= new Song("Utah", "Brotherkenzie", "Folk");
    Song ByAndBy= new Song("By and By", "Caamp", "Folk");
    Song MrMom= new Song("Mr. Mom", "Lonestar", "Country");
    Song InternationalHarvester= new Song("International Harvester", "Craig Morgan", "Country");



    public void test1(){
        System.out.println("Basic Playlist");
        basicPlaylist basic1 = new basicPlaylist();
        basic1.addSong(SevenRings);
        basic1.addSong(ChopSuey);
        basic1.addSong(Yellow);
        basic1.addSong(Utah);
        basic1.addSong(Sandstorm);
        basic1.removeSong(ChopSuey);
    }

    public void test2(){
        genrePlaylist genre1 = new genrePlaylist("Pop");

    }

    public void test3(){
        artistPlaylist artist1 = new artistPlaylist("DrDog");
    }

    public static void main(String[] args){

        System.out.println("Welcome to Playlist mixer");
        System.out.println("Choose from the options below to continue");

        System.out.println(" " +
                "Play/Pause:           p\n " +
                "Add Song to Playlist: a\n" +
                " Remove Song:          r\n" +
                " Add to Queue:         q\n" +
                " Skip:                 n\n" +
                " Shuffle:              s\n" +
                " Get song info:        i\n" +
                " End session:          e\n");

        Scanner input = new Scanner(System.in);
        String selection = "";
        do{
            System.out.print("Enter selection: ");
            selection = input.nextLine();
            // TODO add if selection = "a"...
        }while(selection != "e");

    }

}

