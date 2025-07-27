package live;
import music.String.veena;
import music.wind.saxophone;
import music.playable;

public class Test {
    public static void main(String[] args) {
        veena ve = new veena();
        ve.play();

        saxophone sax = new saxophone();
        sax.play();
        playable p;
        p = ve;
        p.play();

        p = sax;
        p.play();
    }
}