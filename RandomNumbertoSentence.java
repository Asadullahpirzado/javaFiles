import java.util.Random;

public class RandomNumbertoSentence {
    public static void main(String[] args) {
        Random random = new Random();
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        for (int i = 0; i < 20; i++) {
            String sentence = article[random.nextInt(5)] + " " +
                    noun[random.nextInt(5)] + " " +
                    verb[random.nextInt(5)] + " " +
                    preposition[random.nextInt(5)] + " " +
                    article[random.nextInt(5)] + " " +
                    noun[random.nextInt(5)] + ".";

            // Capitalize the first letter of the sentence
            sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

            // Print the generated sentence
            System.out.println(sentence);
        }
    }
}
