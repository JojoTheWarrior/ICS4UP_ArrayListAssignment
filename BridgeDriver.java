/**
 * <p>BridgeDriver Class</p>
 *
 * <h2>Course Info:</h2>
 * ISC4U0 with Krasteva, V.
 *
 * @version 1.1
 * @author Joshua Wang & Kori Kaufman
 */
public class BridgeDriver {
  /**
   * Main method, creates object of KoriKaufmanJoshuaWang_Bridge class, introduces purpose of program, calls shuffleDeck(), deal(), and display() methods
   */
  public static void main (String[] args) {
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
