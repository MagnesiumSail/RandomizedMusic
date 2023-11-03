import org.jfugue.player.Player;
import java.util.Random;

public class RandomMusic {
  public static void main(String[] args) {
    //basic setup
    String rndNote = "";
    String rndSpeed = "";
    Player player1 = new Player();
    Random rand = new Random();
    //music loop
    while(true) {
        //randomize chord and speed
        rndNote = Music.setupChord(rand.nextInt(9));
        rndSpeed = Music.setupSpeed(rand.nextInt(3));
        //play first 2 notes
        Music.playNote(player1, rndNote, rndSpeed, "I56 ");
        //play 3 & 4 notes of same speed different chord
        rndNote = Music.setupChord(rand.nextInt(9));
        Music.playNote(player1, rndNote, rndSpeed, "I56 ");
        }
    }
}

