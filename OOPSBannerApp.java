import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Map to store character patterns
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new CharacterPattern('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        }));

        // Pattern for P
        patternMap.put('P', new CharacterPattern('P', new String[]{
                " PPPP  ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     "
        }));

        // Pattern for S
        patternMap.put('S', new CharacterPattern('S', new String[]{
                "  SSSS ",
                " S     ",
                "  SSS  ",
                "     S ",
                " SSSS  "
        }));

        String word = "OOPS";
        int height = 5;

        // Print banner
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}