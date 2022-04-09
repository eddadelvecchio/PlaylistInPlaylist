public class Main {
    public static void main (String[] args) {
        Playlist p = new Playlist("Ciao");
        Playlist m = new Playlist("Addio");
        Song s = new Song("Cane", "Gatto", 3.54);
        Song c = new Song("Topo", "Gatto", 4.12);
        Song b = new Song("Riccio", "Queen", 2.58);
        new ConcreteObserver(p);
        p.addPlaylistItem(s);                                                                                          
        p.addPlaylistItem(b);
        m.addPlaylistItem(c);
        p.addPlaylistItem(m);
        //p.play();
        //p.removePlaylistItem(s);
        //p.play();
        //SingletonPlaylist.getInstance();
        //SingletonPlaylist.runMenu();
        //RiproduzioneCasuale rip = new RiproduzioneCasuale();
        //rip.riproduci(p);
        //p.playSound("music.wav");
    }
}