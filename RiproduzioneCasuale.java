import java.util.Random;
import java.util.ArrayList;

public class RiproduzioneCasuale implements Riproduzione {

    public RiproduzioneCasuale(){};        
         
    Random random = new Random();
        
    public void riproduci(Playlist playlist){
        for(int i=0; i < playlist.getSize(); i++){
            ArrayList<PlaylistItem> item = playlist.getItems();
            System.out.println(item.get(random.nextInt(playlist.getSize())));
            
        }
        
    }
}

