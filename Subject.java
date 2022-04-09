import java.util.ArrayList;

public abstract class Subject {
    
    protected ArrayList<Observer> obs = new ArrayList<>();

    public void attach(Observer ob){
        obs.add(ob);
        System.out.println("Il subject ha effettuato l'attach all'observer");
    }

    public void detach(Observer ob){
     obs.remove(ob);
    }

	protected void notifyObservers() {
		for (Observer ob : obs ) {
            ob.update(this);
        }

	}

 
}
