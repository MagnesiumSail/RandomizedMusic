import org.jfugue.player.Player;

public class Music {
    public static void playNote(Player player1, Player player2, String note, String speed) {
        String comboNote = "I56 " + note + speed;
        System.out.println(comboNote);
        player1.play(comboNote);
        //pauseForNoteDuration(speed, false);
        playDupe(player2, note, speed);
        //pauseForNoteDuration(speed, true);
    }

    public static void playDupe(Player player2, String note, String speed) {
        String comboNote = "I40 " + note + speed;
        player2.play(comboNote);
    }

    public static String setupChord(int rndNote) {
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
            case 0:
                return "wa127";   
            case 1:
                return "ha64";
            case 2:
                return "qa32";
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