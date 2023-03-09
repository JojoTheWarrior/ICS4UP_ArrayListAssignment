import java.util.*;

/**
 * <h1>Course Info</h1>
 * ICS4UP with Krasteva, V.
 * 
 * @author Kori Kaufman and Joshua Wang
 * 
 * This class contains 5 ArrayLists of Strings that each contain one type of a word. Then, simple sentences are created by following a simple English sentence structure.
 */
public class KoriKaufmanJoshuaWang_Sentences {
    /**
     * ArrayList for articles. English has 3 articles: "a", "an", and "the". To ensure grammatical integrity and to maintain simplicity, all nouns in this program will only start with consonants.
     */
    private ArrayList<String> articles = new ArrayList<String>(Arrays.asList(
        "a",
        "the"
    ));
    /**
     * ArrayList for nouns (no proper nouns, only common nouns).
     */
    private ArrayList<String> nouns = new ArrayList<String>(Arrays.asList(
        "damage",
        "worker",
        "winner",
        "suggestion",
        "departure",
        "child",
        "connection",
        "variation",
        "depth",
        "meaning",
        "marriage",
        "death",
        "location",
        "negotiation",
        "poem",
        "complaint",
        "concept",
        "consequence",
        "length",
        "shirt",
        "person",
        "house",
        "hair",
        "statement",
        "leader",
        "fact",
        "tongue",
        "cheek"
    ));
    /**
     * ArrayList for verbs. 
     */
    private ArrayList<String> verbs = new ArrayList<String>(Arrays.asList(
        "exposes",
        "exports",
        "achieves",
        "controls",
        "provides",
        "announces",
        "draws",
        "slaps",
        "invests",
        "eats",
        "speaks",
        "cuts",
        "assumes",
        "denies",
        "squeezes",
        "causes",
        "characterises",
        "illustrates",
        "highlights",
        "sacks",
        "hires",
        "bullies",
        "splits",
        "bothers",
        "replies",
        "buries",
        "balances",
        "schedules",
        "relies",
        "imports",
        "qualifise",
        "trusts",
        "confides",
        "swims",
        "abolishes",
        "exhibits",
        "approaches",
        "covers",
        "accounts",
        "plans",
        "tours",
        "facilitates",
        "markets",
        "discloses",
        "calls"
    ));
    /**
     * ArrayList for prepositions.
     */
    private ArrayList<String> prepositions = new ArrayList<String>(Arrays.asList(
        "of",
        "with",
        "at",
        "from",
        "into",
        "during",
        "including",
        "until",
        "against",
        "among",
        "throughout",
        "despite",
        "towards",
        "upon",
        "concerning",
        "to",
        "in",
        "for",
        "on",
        "by",
        "about",
        "like",
        "through",
        "over",
        "before",
        "between",
        "after",
        "since",
        "without",
        "under",
        "within",
        "along",
        "following",
        "across",
        "behind",
        "beyond",
        "plus",
        "but",
        "up",
        "out",
        "around",
        "down",
        "off",
        "above",
        "near"
    ));
    /**
     * ArrayList for both adjective and adverbs (to convert to an adverb, all these adjectives can have "-ly" appened to it)
     */
    private ArrayList<String> adjectives = new ArrayList<String>(Arrays.asList(
        "majestic",
        "wonderful",
        "typical",
        "rampant",
        "harsh",
        "practical",
        "different",
        "beneficial",
        "faithful",
        "normal",
        "abnormal",
        "slow",
        "quick"
    ));
    /**
     * @return Random String at a random index of the passed ArrayList.
     */
    public String rand(ArrayList<String> s){
        int ind = (int) (Math.random() * s.size());
        return s.get(ind);
    }
    /**
     * Replaces the first character of the String with a capital.
     * @return The capitalized word.
     */
    public String capitalize(String s){
        String ret = "";
        ret += (char) (s.charAt(0) - 'a' + 'A');
        ret += s.substring(1, s.length());
        return ret;
    }
    /**
     * Uses one of the following sentence structure: 
     *    - Article | Noun | Verb | Preposition | Article | Adjective | Noun 
     *    - Article | Adjective | Noun | Adverb | Verb | Preposition | Article | Adjective | Noun
     *    - Noun | Adverbs | Verb | Preposition | Nouns (Plural)
     * @return Randomly generated sentence.
     */
    public String getSentence(){
        int mode = (int) (Math.random() * 3);

        if (mode == 0){
            return capitalize(rand(articles)) + " " + rand(nouns) + " " + rand(verbs) + " " + rand(prepositions) + " " + rand(articles) + " " + rand(adjectives) + " " + rand(nouns) + ".";
        } else if (mode == 1){
            return capitalize(rand(articles)) + " " + rand(adjectives) + " " + rand(nouns) + " " + rand(adjectives) + "ly " + rand(verbs) + " " + rand(prepositions) + " " + rand(articles) + " " + rand(adjectives) + " " + rand(nouns) + ".";
         } else {
            return capitalize(rand(nouns)) + " " + rand(adjectives) + "ly " + rand(verbs) + " " + rand(prepositions) + " " + rand(nouns) + "s.";
        }
    }
    
    public static void main(String[] args){
        KoriKaufmanJoshuaWang_Sentences driver = new KoriKaufmanJoshuaWang_Sentences();
        for (int i = 1; i <= 10; i++){
            System.out.println(driver.getSentence());
        }
    }
}