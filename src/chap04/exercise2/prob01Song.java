package chap04.exercise2;

public class prob01Song {

    private String title;
    public prob01Song(String title) {
        this.title = title;
    }
    private String getTitle() {
        return title;
    }


    public static void main(String[] args) {
        prob01Song mySong     = new prob01Song("LaLaLa");
        prob01Song yourSong   = new prob01Song("Oh yeah");
        System.out.println(mySong.getTitle());
        System.out.println(yourSong.getTitle());
    }
}
