public class Song extends PlaylistItem {
    String name;
    String artist;
    double duration;

    Song(String name, String artist, double duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    String getName() {
        return name;
    }

    String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    void setName(String name) {
        this.name = name;
    }

    void setArtist(String artist) {
        this.artist = artist;
    }

    void setDuration(double duration) {
        this.duration = duration;
    }

    public String toString() {
        return this.name + " " + this.artist + " " + this.duration + "\n";
    }
    
    public void play(){
        System.out.println(this);
    }
    
}
