import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream; 
    
public class ConcreteObserverTest {
     
    @Test
    public void test() {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bout);
        Playlist p = new Playlist("Ciao");
        Song b = new Song("Riccio", "Queen", 2.58);   
        new ConcreteObserver(p); 
        System.setOut(ps);
        p.addPlaylistItem(b);
        assertEquals(bout.toString(),p.toString() + "\n");
    }

}
    