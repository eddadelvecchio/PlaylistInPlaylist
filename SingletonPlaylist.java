import java.util.Scanner;

public class SingletonPlaylist {

    private static final Playlist INSTANCE = new Playlist("MAIN");
    
    private SingletonPlaylist(){}

    public static Playlist getInstance() {
        return INSTANCE;
    }

    public static void runMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.print("\n Cosa vuoi fare?\n1. Aggiungi una canzone\n2. Aggiungi una playlist\n3. Riprodurre Playlist \n4. Esci \n");

        String selection = (scan.nextLine());


        switch (selection) {
            case "1":
                System.out.println("Inserisci titolo canzone");
                String name = scan.nextLine();
                System.out.println("Inserisci autore canzone");
                String autore = scan.nextLine();
                System.out.println("Inserisci durata canzone");
                double duration = scan.nextDouble();
                
                INSTANCE.addPlaylistItem(new Song(name, autore, duration));
                INSTANCE.play();
                
                runMenu();
                break;

           case "2":
                System.out.println("Inserisci nome playlist");
                String title = scan.nextLine();
                    System.out.println("Inserisci titolo canzone");
                    String nome = scan.nextLine();
                    System.out.println("Inserisci autore canzone");
                    String author = scan.nextLine();
                    System.out.println("Inserisci durata canzone");
                    double durata = scan.nextDouble();
                        
                    INSTANCE.addPlaylistItem(new Playlist(title));
                    INSTANCE.addPlaylistItem(new Song(nome, author, durata));
                    INSTANCE.play();

                runMenu();
                break;
                              
    
            case "3":
                INSTANCE.play();
                break; 
            

            case "4":
                break;
            }
            
        scan.close();
    }
    
}
