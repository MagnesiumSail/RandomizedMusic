import org.jfugue.player.Player;

public class Music {
    public static void playNote(Player player1, String note, String speed, String instrument) {
        //make note from all randomization
        String comboNote = instrument + note + speed;
        System.out.println(comboNote);
        //play full note
        player1.play(comboNote);
        //pauseForNoteDuration(speed, false);
        if (instrument == "I40 ") //base case
            return;
            else {
                //2nd loop setup
                instrument = "I40 ";
            }
        //recusion through again
        playNote(player1, note, speed, instrument);
    }

    public static String setupChord(int rndNote) {
        //set random int to chord
        switch (rndNote) {
            case 1:
                return "Cmaj";
            case 2:
                return "Gmaj";
            case 3:
                return "Dmin";
            case 4:
                return "Amin";
            case 5: 
                return "Emin";
            case 6: 
                return "Bdim";
            case 7:
                return "Fmaj"; 
            case 8:
                return "Cmaj";
            default:
                return "Cmaj";
        }
    }

    public static String setupSpeed(int rndSpeed) {
        switch (rndSpeed) {
            //set random int to note speed
            case 0:
                return "wa127";   
            case 1:
                return "ha64";
            case 2:
                return "qa1d1";
            default:
                return "wa127d127";
        }
    }

    public static void pauseForNoteDuration(String speed, Boolean secondPass) {
        //unused. Couldn't figure out how to get this to work with threads properly.
        long durationInMillis = 0;

        switch (speed) {
            case "wa127":
                durationInMillis = 2000;
                break;
            case "ha64":
                durationInMillis = 1000;
                break;
            case "qa32":
                durationInMillis = 500;
                break;
        }
        
        try {
            Thread.sleep(durationInMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Interrupted while waiting for note duration.");
        }
    }
}