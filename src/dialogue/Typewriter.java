package dialogue;

/**
 * @author Alexander Westbrooks
 * Created on April 18, 2018
 *
 * {@link Typewriter} is a dialogue utitility class intended to type out dialogue text
 * with a typewriter effect, i.e. one character at a time. There are default speeds for
 * the text to be displayed as well as a customizable speed method accessible to the
 * user. The class methods can replace a {@link System} out println statement in order
 * to produce the effect.
 */
public class Typewriter {
    // These default times are in milliseconds
    private static final long FAST_TEXT_DELAY = 10L;
    private static final long REGULAR_TEXT_DELAY = 30L;
    private static final long SLOW_TEXT_DELAY = 100L;


    public Typewriter(){}

    /**
     * Prints to console a single character of the given text every 0.1 seconds, i.e. 100 milliseconds
     * Method completes once all characters in text are printed.
     * @param text the data to be printed to the console
     */
    public static void typeSlow(String text){
        typeCustomSpeed(text, SLOW_TEXT_DELAY);
    }

    /**
     * Prints to the console a single character of the given text every 0.03 seconds, i.e. 30
     * milliseconds. Method completes once all characters in text are printed.
     * @param text the data to be printed to the console
     */
    public static void type(String text){
        typeCustomSpeed(text, REGULAR_TEXT_DELAY);
    }

    /**
     * Prints to the console with the fastest default speed: a single character of the given
     * text every 0.01 seconds, i.e. 10 milliseconds. Method completes once all characters in
     * text are printed.
     * @param text
     */
    public static void typeFast(String text){
        typeCustomSpeed(text, FAST_TEXT_DELAY);
    }

    /**
     * Prints to the console with a user defined time delay for each character to be printed.
     * @param text the data to be printed to the console
     * @param millisecTimeDelay given as a long value the number of milliseconds in each delay
     */
    public static void typeCustomSpeed(String text, long millisecTimeDelay) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(millisecTimeDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
