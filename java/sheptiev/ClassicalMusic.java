package sheptiev;


import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music {

    private static String[] classicalMusicStrings = new String[3];

    static {
        classicalMusicStrings[0] = "Check Yo Self";
        classicalMusicStrings[1] = "This Charming Man";
        classicalMusicStrings[2] = "Walking";
    }
    static int getCapacity() {
        return classicalMusicStrings.length;
    }


    @Override
    public String[] getSong() {
        return classicalMusicStrings;
    }
}
