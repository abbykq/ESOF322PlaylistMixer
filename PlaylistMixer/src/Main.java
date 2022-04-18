import java.util.Scanner;
import java.util.*;
public class Main {

    // SAMPLE SONG DATABASE
    public static List songList() {
        // for genre playlist Pop
        Song Good4You = new Song("good 4 you", "Olivia Rodrigo", "Pop");
        Song SevenRings = new Song("7SevenRings", "Arianna Grande", "Pop");
        Song Photograph = new Song("Photograph", "Ed Sheeran", "Pop");
        Song AsItWas = new Song("As It Was", "Harry Styles", "Pop");
        Song BlankSpace = new Song("Blank Space", "Taylor Swift", "Pop");
        // for artist playlist Dr.Dog
        Song TheBreeze = new Song("The Breeze", "DrDog", "Alt/Indie");
        Song Nellie = new Song("Nellie", "DrDog", "Alt/Indie");
        Song ShadowPeople = new Song("Shadow People", "DrDog", "Alt/Indie");
        Song HeartItRaces = new Song("Heart It Races", "DrDog", "Alt/Indie");
        Song AbandonedMansion = new Song("Abandonded Mansion", "DrDog", "Alt/Indie");
        // random songs
        Song AtLast = new Song("At Last", "Etta James", "Jazz");
        Song Sandstorm = new Song("Sandstorm", "Darude", "EDM");
        Song Kids = new Song("Kids", "Current Joys", "Alt/Indie");
        Song IMissYou = new Song("I Miss You", "Blink182", "Punk Rock");
        Song Yellow = new Song("Yellow", "Coldplay", "Alt/Rock");
        Song ChopSuey = new Song("Chop Suey!", "System Of A Down", "Metal");
        Song SchoolsOut = new Song("School's Out", "Alice Cooper", "Rock");
        Song Utah = new Song("Utah", "Brotherkenzie", "Folk");
        Song MrMom = new Song("Mr. Mom", "Lonestar", "Country");
        Song SameDrugs = new Song("Same Drugs", "Chance The Rapper", "Rap");
        Song AroundTheWorld = new Song("Around the World", "Daft Punk", "EDM");
        Song ILoveYouSo = new Song("I Love You So", "The Walters", "Alt/Indie");
        Song BasketCase = new Song("Basket Case", "Green Day", "Punk Rock");
        Song MrBrightSide = new Song("Mr. Brightside", "The Killers", "Alt/Rock");
        Song BringMeToLife = new Song("Bring Me To Life", "Evanescence", "Metal");
        Song StairWayToHeaven = new Song("Stairway To Heaven", "Led Zeppelin", "Rock");
        Song ByAndBy = new Song("By and By", "Caamp", "Folk");
        Song LOVE = new Song("LOVE", "Nat King Cole", "Jazz");
        Song InternationalHarvester = new Song("International Harvester", "Craig Morgan", "Country");

        List<Song> songs = new ArrayList<>();
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
        songs.add(AroundTheWorld);
        songs.add(ILoveYouSo);
        songs.add(BasketCase);
        songs.add(MrBrightSide);
        songs.add(BringMeToLife);
        songs.add(StairWayToHeaven);
        songs.add(ByAndBy);
        songs.add(LOVE);
        songs.add(InternationalHarvester);
        return songs;
    }

    public static void printOptions() {
        System.out.println("""
                 Play/Pause:                  play or pause
                 Play Specific Song:          play song
                 Add Song to Playlist:        add
                 Remove Song From Playlist:   remove
                 Add to Queue:                queue
                 Skip Current Song:           skip
                 Shuffle Queue:               shuffle
                 Get Playlist info:           info
                 Print Playlist:              print
                 Print Options again:         help
                 End session:                 end
                """);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Playlist mixer");
        Playlist userPlaylist = null;
        boolean correctInput = false;
        do {
            System.out.println("What type of playlist would you like to make? Choose from Basic, Genre, Artist: ");
            Scanner playlistTypeInput = new Scanner(System.in);
            String playlistType = playlistTypeInput.nextLine();
            playlistType = playlistType.toLowerCase();
            if (playlistType.equals("basic")) {
                userPlaylist = new basicPlaylist();
                correctInput = true;
            } else if (playlistType.equals("genre")) {
                Scanner genreInput = new Scanner(System.in);
                String genre;
                ArrayList<String> genreList = new ArrayList<>(List.of("pop", "alt/indie", "jazz", "edm", "punk rock", "alt/rock", "metal", "rock", "folk", "country", "rap"));
                do {
                    System.out.println("Select type of genre: ");
                    System.out.println("Pop, Alt/Indie, Jazz, EDM, Punk Rock, Alt/Rock, Metal, Rock, Folk, Country, Rap");
                    genre = genreInput.nextLine();
                    genre = genre.toLowerCase().strip();
                    if(!genreList.contains(genre)){
                        System.out.println("This is not a recognized genre");
                    }
                } while(!genreList.contains(genre));
                genre = genre.substring(0,1).toUpperCase() + genre.substring(1);
                userPlaylist = new genrePlaylist(genre);
                List<Song> songs = songList();
                for (Song songToCheck : songs) {
                    Song checkGenre = (Song) songToCheck;
                    String songGenre = checkGenre.getGenre();
                    if (songGenre.equals(genre)) {
                        userPlaylist.addSong(songToCheck);
                    }
                }
                correctInput = true;
            } else if (playlistType.equals("artist")) {
                Scanner artistInput = new Scanner(System.in);
                System.out.println("What artist? ");
                String artist = artistInput.nextLine();
                userPlaylist = new artistPlaylist(artist);
                List<Song> songs = songList();
                for (Song songToCheck : songs) {
                    Song checkArtist = (Song) songToCheck;
                    String songArtist = checkArtist.getArtist();
                    if (songArtist.equals(artist)) {
                        userPlaylist.addSong(songToCheck);
                    }
                }
                correctInput = true;
            } else {
                System.out.println("Incorrect input, please try again");
            }

        }while(!correctInput);
            System.out.println("\nChoose from the options below to continue");

            printOptions();

            Scanner input = new Scanner(System.in);
            String selection = "";
            do {
                System.out.print("Enter selection: ");
                selection = input.nextLine();
                selection = selection.toLowerCase();
                System.out.println();
                if (selection.equals("play") || selection.equals("pause")) {
                    userPlaylist.togglePlayPause();
                    System.out.println("type 'help' to print options");
                } else if (selection.equals("play song")) {
                    Scanner toPlayInput = new Scanner(System.in);
                    System.out.print("Which song? ");
                    String toPlay = toPlayInput.nextLine();
                    userPlaylist.playSong(toPlay);
                    System.out.println("type 'help' to print options");
                } else if (selection.equals("add")) {
                    Scanner songTitleInput = new Scanner(System.in);
                    Scanner songArtistInput = new Scanner(System.in);
                    Scanner songGenreInput = new Scanner(System.in);
                    System.out.print("Title of song: ");
                    String title = songTitleInput.nextLine();
                    System.out.print("Artist of song: ");
                    String artistAdd = songArtistInput.nextLine();
                    System.out.print("Genre of song: ");
                    String genre = songGenreInput.nextLine();
                    Song newSong = new Song(title, artistAdd, genre);
                    userPlaylist.addSong(newSong);
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("remove")) {
                    Scanner toRemoveInput = new Scanner(System.in);
                    System.out.print("Song to remove: ");
                    String toRemove = toRemoveInput.nextLine();
                    userPlaylist.removeSong(toRemove);
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("queue")) {
                    Scanner toQueueInput = new Scanner(System.in);
                    System.out.print("Song to queue: ");
                    String toQueue = toQueueInput.nextLine();
                    userPlaylist.queueSong(toQueue);
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("skip")) {
                    userPlaylist.skip();
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("shuffle")) {
                    userPlaylist.shuffle();
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("info")) {
                    System.out.println(userPlaylist.getInfo());
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("print")) {
                    userPlaylist.print();
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("help")) {
                    printOptions();
                    System.out.println("Type 'help' to print options");
                } else if (selection.equals("end")){
                    System.out.println("Thanks for using PlayMix Mixa!");
                } else{
                    System.out.println("Incorrect input, please try again");
                }

            } while (!selection.equals("end"));

            System.exit(0);
        }
    }


