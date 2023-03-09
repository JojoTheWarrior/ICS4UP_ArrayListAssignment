/** Imports ArrayList, Collections, and Arrays classes */
import java.util.*;

/**
 * <p>Class for playing a round of Bridge</p>
 *
 * <h2>Course Info:</h2>
 * <p>ISC4U0 with Krasteva, V.<p>
 *
 * @version 1.1
 * @author Kori Kaufman and Joshua Wang
 */
public class KoriKaufmanJoshuaWang_Bridge {
  /** Full deck */
  private ArrayList<String> deck = new ArrayList<String>(52);
  /** Cards dealt to player one */
  private ArrayList<String> player1 = new ArrayList<String>(13);
  /** Cards dealt to player two */
  private ArrayList<String> player2 = new ArrayList<String>(13);
  /** Cards dealt to player three */
  private ArrayList<String> player3 = new ArrayList<String>(13);
  /** Cards dealt to player four */
  private ArrayList<String> player4 = new ArrayList<String>(13);
  
  /**
   * Constructor
   * Adds cards to deck
   */ 
  public KoriKaufmanJoshuaWang_Bridge () {
    String d = "2D,3D,4D,5D,6D,7D,8D,9D,TD,JD,QD,KD,AD,2H,3H,4H,5H,6H,7H,8H,9H,TH,JH,QH,KH,AH,2S,3S,4S,5S,6S,7S,8S,9S,TS,JS,QS,KS,AS,2C,3C,4C,5C,6C,7C,8C,9C,TC,JC,QC,KC,AC";
    String[] da = d.split(",");
    Collections.addAll(deck,da);
  }
  
  /** 
   * Shuffles deck
   */
  public void shuffleDeck () {
    Collections.shuffle(deck);
  }
  
  /**
   * Deals cards to players, removes cards from deck
   */
  public void deal () {
    int j = 52;
    for (int i = 0; i < 13; i++) {
      int index = (int) (Math.random() * j);
      player1.add(deck.get(index));
      deck.remove(index);
      j--;
      index = (int) (Math.random() * j);
      player2.add(deck.get(index));
      deck.remove(index);
      j--;
      index = (int) (Math.random() * j);
      player3.add(deck.get(index));
      deck.remove(index);
      j--;
      index = (int) (Math.random() * j);
      player4.add(deck.get(index));
      deck.remove(index);
      j--;
    }
  }
  
  /**
   * Calculates points for player
   *
   * @param x Hand of player whose points are being calculated
   *
   * @return points Total number of points for player
   */
  private int points (ArrayList<String> x) {
    int diaCount = 0;
    int heaCount = 0;
    int spaCount = 0;
    int cluCount = 0;
    int points = 0;
    for (String a : x) {
      if (a.contains("K")) points = points + 3;
      if (a.contains("Q")) points = points + 2;
      if (a.contains("J")) points = points + 1;
      if (a.contains("A")) points = points + 4;
      if (a.contains("D")) diaCount++;
      if (a.contains("H")) heaCount++;
      if (a.contains("S")) spaCount++;
      if (a.contains("C")) cluCount++;
    }
    if (diaCount == 2) points++;
    if (diaCount == 1) points = points + 2;
    if (diaCount == 0) points = points + 3;
    if (heaCount == 2) points++;
    if (heaCount == 1) points = points + 2;
    if (heaCount == 0) points = points + 3;
    if (spaCount == 2) points++;
    if (spaCount == 1) points = points + 2;
    if (spaCount == 0) points = points + 3;
    if (cluCount == 2) points++;
    if (cluCount == 1) points = points + 2;
    if (cluCount == 0) points = points + 3;
    
    return points;
  }
  
  /**
   * Names winner of round
   *
   * @return winner Number of player who won
   */
  private int winner () {
    int pp1 = points(player1);
    int pp2 = points(player2);
    int pp3 = points(player3);
    int pp4 = points(player4);
    int biggest = 0;
    int winner = 0;
    if (pp1 > biggest) {
      biggest = pp1;
      winner = 1;
    }
    if (pp2 > biggest) {
      biggest = pp2;
      winner = 2;
    }
    if (pp3 > biggest) {
      winner = 3;
      biggest = pp3;
    }
    if (pp4 > biggest) {
      winner = 4;
      biggest = pp4;
    }
    return winner;
  }
  
  /**
   * Splits player's hand into suits for display of hands
   * 
   * @param x Hand of player
   */
  public void splt (ArrayList<String> x) {
    for (String a : x) { 
      if (a.contains("S")) System.out.print(a + " ");
    }
    System.out.println();
    for (String a : x) { 
      if (a.contains("H")) System.out.print(a + " ");
    }
    System.out.println();
    for (String a : x) { 
      if (a.contains("D")) System.out.print(a + " ");
    }
    System.out.println();
    for (String a : x) { 
      if (a.contains("C")) System.out.print(a + " ");
    }
    System.out.println();
  } 
  
  /**
   * Displays hands and winner
   */
  public void display () {
    player1.removeAll(Arrays.asList("",null));
    player2.removeAll(Arrays.asList("",null));
    player3.removeAll(Arrays.asList("",null));
    player4.removeAll(Arrays.asList("",null));
    System.out.println("Player 1's cards are: ");
    splt(player1);
    System.out.println("Player 2's cards are: ");
    splt(player2);
    System.out.println("Player 3's cards are: ");
    splt(player3);
    System.out.println("Player 4's cards are: ");
    splt(player4);
    
    System.out.println("\nThe winner is Player " + winner() + ".");
  }

  /**
   * Driver method for a game of KoriKaufmanJoshuaWang_Bridge.
   * @param args
   */
  public static void main(String[] args){
    KoriKaufmanJoshuaWang_Bridge b = new KoriKaufmanJoshuaWang_Bridge();
    b.shuffleDeck();
    b.deal();
    System.out.println("Welcome one and all to a round of Bridge!");
    System.out.println("Applause, people, applause.");
    System.out.println("The deck has been shuffled, the cards dealt...");
    System.out.println("Let's see who wins.\n");
    b.display();
    System.out.println("\nThank you for joining us! Do come again.");
  }
}

