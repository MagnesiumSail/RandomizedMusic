import org.jfugue.player.Player;
import java.util.Random;

public class RandomMusic {
  public static void main(String[] args) {
    String rndNote = "";
    String rndSpeed = "";
    Player player1 = new Player(); // setup the player
    Player player2 = new Player();
    Random rand = new Random();
    while(true) {
        rndNote = Music.setupChord(rand.nextInt(9));
        rndSpeed = Music.setupSpeed(rand.nextInt(3));
        Music.playNote(player1, player2, rndNote, rndSpeed);
        }
    }
}

