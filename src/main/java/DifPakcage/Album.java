package DifPakcage;

import java.util.ArrayList;

public class Album extends Item {
    private ArrayList<Song> songs;

    public Album(String name) {
        super(name);
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Album: " + getName() + "\nSongs:\n");
        for (Song song : songs) {
            sb.append("\t").append(song).append("\n");
        }
        return sb.toString();
    }
}
