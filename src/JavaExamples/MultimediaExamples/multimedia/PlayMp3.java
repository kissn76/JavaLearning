package multimedia;

import java.io.FileInputStream;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class PlayMp3 {

    public static void main(String[] args) {
        dingSample();
    }

    static void dingSample() {
        String file = "ding.mp3";
        try {
            FileInputStream fis = new FileInputStream(file);
            AdvancedPlayer playMP3 = new AdvancedPlayer(fis);
            playMP3.play();
            // playMP3.play(1270, 1870);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
