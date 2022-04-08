import java.util.Scanner;

public class Main {
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

