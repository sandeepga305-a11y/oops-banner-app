import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                " PPPP  ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                "  SSSS ",
                " S     ",
                "  SSS  ",
                "     S ",
                " SSSS  "
        });

        String word = "OOPS";

        // Call rendering function
        renderBanner(word, patternMap);
    }
}