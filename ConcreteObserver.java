public class ConcreteObserver implements Observer {

    public ConcreteObserver(Playlist p) {
        p.attach(this);
    }

    @Override
    public void update(Subject s) {
        if (s.getClass() == Playlist.class) {
                System.out.print((Playlist) s + "\n");
         }
    }
    
    
}
