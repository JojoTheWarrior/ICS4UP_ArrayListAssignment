import java.util.*;

/**
 * <p>Creates random sentences but prioritizing rhyming words<p>
 * 
 * <h1>Course Info:</h1>
 * ICS4UP with Krasteva, V.
 * 
 * @version 1.1
 * @author Kori Kaufman and Joshua Wang
 */
public class KoriKaufmanJoshuaWang_AIPoem extends KoriKaufmanJoshuaWang_Sentences {
    /**
     * ArrayList for all the rhyming nouns that rhyme with "most"
     */    
    private ArrayList<String> rhymeNouns = new ArrayList<String>(Arrays.asList(
        "post",
        "coast",
        "host",
        "ghost",
        "toast",
        "roast",
        "poste",
        "impost",
        "coat",
        "throat"
    ));
    /**
     * ArrayList for all the rhyming adjectives that rhyme with "most"
     */    
    private ArrayList<String> rhymeAdjectives = new ArrayList<String>(Arrays.asList(
        "engrossed",
        "thrombosed",
        "upmost",
        "overdosed",
        "dosed",
        "unbeknownst",
        "remote",
        "evoked",
        "provoked",
        "smoked",
        "soaked",
        "choked",
        "doped",
        "sloped",
        "broached",
        "cloaked",
        "roped",
        "unprovoked",
        "poached"
    ));
    /**
     * ArrayList for all the rhyming verbs that rhyme with "most"
     */    
    private ArrayList<String> rhymeVerbs = new ArrayList<String>(Arrays.asList(
        "hoped",
        "votes",
        "promotes",
        "stroked",
        "grossed",
        "diagnosed",
        "boast",
        "note",
        "wrote",
        "vote",
        "promote",
        "approached",
        "quote",
        "denote",
        "float",
        "devote",
        "invoked",
        "stroked",
        "poked",
        "afloat",
        "boasts",
        "joked",
        "revoked",
        "reproached",
        "groped",
        "coached",
        "coaxed",
        "smote",
        "coped",
        "tote",
        "connote",
        "roped",
        "yoked",
        "croaked",
        "encroached",
        "rewrote"
    ));

    /**
     * Prints a rhyming poem. Randomly prints either 2 or 4 sentences using one of the following sentence structures, but more rhyming words are thrown in:
     *  - Article | Adjective | Rhyming Adjective | Noun | Preposition | Adverb | Rhyming Verb
     *  - Rhyming Adjective | Rhyming Noun | Adverb | Rhyming Verb | Preposition | Article | Rhyming Adjective | Rhyming Noun
     *  - Preposition | Article | Rhyming Adjective | Noun | , | Adverb | Rhyming Verb | Article | Rhyming Adjective | Rhyming Noun | Rhyming Verb
     */
    public void printPoemStanza(){
        int totalSentences = 2 * (1 + (int) (Math.random() * 2));
        for (; totalSentences > 0; totalSentences--){
            int mode = (int) (Math.random() * 4);
            String thisSentence = "";

            if (mode == 0){
                thisSentence = capitalize(rand(rhymeNouns)) + ", " + rand(articles) + " " + rand(adjectives) + " " + rand(rhymeAdjectives) + ", " + rand(prepositions) + " " + rand(adjectives) + "ly " + rand(rhymeVerbs);
            } else if (mode == 1){
                thisSentence = capitalize(rand(rhymeAdjectives)) + " " + rand(rhymeNouns) + " " + rand(adjectives) + "ly " + rand(rhymeVerbs) + " " + rand(prepositions) + " " + rand(articles) + " " + rand(rhymeAdjectives) + " " + rand(rhymeNouns);
            } else if (mode == 2){
                thisSentence = capitalize(rand(prepositions)) + " " + rand(articles) + " " + rand(rhymeAdjectives) + " " + rand(nouns) + ", " + rand(adjectives) + "ly " + rand(rhymeVerbs) + " " + rand(articles) + " " + rand(rhymeAdjectives) + " " + rand(rhymeNouns) + " " + rand(rhymeVerbs);
            } else if (mode == 3){
                thisSentence = capitalize(rand(rhymeAdjectives)) + " " + rand(rhymeAdjectives) + " " + rand(nouns) + ", " + rand(adjectives) + "ly " + rand(rhymeVerbs) + ", " + rand(articles) + " " + rand(rhymeNouns);
            }

            System.out.println(thisSentence);
        }
    }

    public static void main(String[] args){
        KoriKaufmanJoshuaWang_AIPoem driver = new KoriKaufmanJoshuaWang_AIPoem();
        System.out.println("Random Poem:\n");
        for (int i = 1; i <= 4; i++){
            driver.printPoemStanza();
            System.out.println();
        }
    }
}