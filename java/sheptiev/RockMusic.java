package sheptiev;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    private static String[] rockMusicStrings = new String[3];

    static {
        rockMusicStrings[0] = "Echoes";
        rockMusicStrings[1] = "Have a Cigar";
        rockMusicStrings[2] = "How I Wish You Were Here";
    }

    static int getCapacity() {
        return rockMusicStrings.length;
    }

    @Override
    public String[] getSong() {
        return rockMusicStrings;
    }
}
