import java.util.Random;

public class Lab3_7{
    public static void main(String[] args) {
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String article1 = articles[rand.nextInt(articles.length)];
            String noun1 = nouns[rand.nextInt(nouns.length)];
            String verb = verbs[rand.nextInt(verbs.length)];
            String preposition = prepositions[rand.nextInt(prepositions.length)];
            String article2 = articles[rand.nextInt(articles.length)];
            String noun2 = nouns[rand.nextInt(nouns.length)];

            String sentence = article1 + " " + noun1 + " " + verb + " " + preposition + " " + article2 + " " + noun2 + ".";

            System.out.println(sentence);
        }
    }
}
