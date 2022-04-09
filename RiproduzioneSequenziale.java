
public class RiproduzioneSequenziale implements Riproduzione {

    public RiproduzioneSequenziale(){}
    

    @Override
    public void riproduci(Playlist playlist){
        for (int i=0; i < playlist.getSize(); i++){
            playlist.play(); 
        }
    }

}
