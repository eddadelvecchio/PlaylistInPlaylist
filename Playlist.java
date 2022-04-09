import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Playlist extends PlaylistItem {
    private ArrayList<PlaylistItem> items;
    private String name;
    
    public Playlist(String name) {
        items = new ArrayList<PlaylistItem>();
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public void addPlaylistItem(PlaylistItem playlistitem){
        items.add(playlistitem);
        this.notifyObservers();
    }

    public void removePlaylistItem(PlaylistItem playlistitem) {
        for(int i = 0; i < this.getSize(); i++){
            if (this.getName().equals(items.toString()));
                items.remove(playlistitem);
        }
       
        this.notifyObservers();
    }

    public int getSize(){
        return items.size();
    }

    public ArrayList<PlaylistItem> getItems() {
        return this.items;
    }

    public String toString() {
        String playlistString = this.name + " ("+ this.getDuration() + ")" + ":\n";        
        return playlistString;
    } 

    public double getDuration(){
        double sum = 0;
        for (PlaylistItem item : items){
            sum += item.getDuration();
        }

        return sum; 
    }

    public void play(){
                System.out.println(this);
                for(PlaylistItem item : items) {
                    item.play();
                }
    }

    public void playSound(String filepath) {
        
        try {
            File musicpath = new File(filepath);
            if(musicpath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

                JOptionPane.showMessageDialog(null, "Press OK to stop the song");
            }

            else 
            {
                System.out.println("File not found");
            }
        }
        
        catch (Exception e) {
            
            JOptionPane.showInputDialog("Error");
        
        }
    }

}
