package sheptiev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;
import java.util.Arrays;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;



    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    public String playMusic(musicGenres genre) {
        Random random = new Random();
        int randomNum = random.nextInt(RockMusic.getCapacity());

        if (genre == musicGenres.ROCK) {
            return "Playing: " + music1.getSong()[randomNum];
        } else {
            return "Playing: " + music2.getSong()[randomNum];
        }
    }

}
