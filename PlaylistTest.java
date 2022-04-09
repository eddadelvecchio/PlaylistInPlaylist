import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;  
    
public class PlaylistTest {
        
    @Test
    public void test() {
        Song s = new Song("testnome", "testartista", 3.12);
        Song s1 = new Song("testnome1", "testartista1", 3.13);

        Playlist testPlaylist = new Playlist("testPlaylist");
        testPlaylist.addPlaylistItem(s);
        testPlaylist.addPlaylistItem(s1);
        assertEquals(testPlaylist.getSize(), 2);
        assertEquals(testPlaylist.getDuration(), s.duration + s1.duration);
        assertEquals(testPlaylist.toString(),"testPlaylist (6.25):\n");
        testPlaylist.removePlaylistItem(s1);
        assertEquals(testPlaylist.getSize(), 1);
        assertEquals(testPlaylist.getDuration(), s.duration);
        assertEquals(testPlaylist.toString(),"testPlaylist (3.12):\n");
    }

}