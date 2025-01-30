public class RandomQuoteGenerator {
 public static void main(String[] args) {
        String[] quotes = {
            "The best way to predict the future is to invent it.",
            "Don’t watch the clock; do what it does. Keep going.",
            "Don’t be afraid to give up the good to go for the great.",
            "The way to get started is to quit talking and begin doing.",
            "The only limit to our realization of tomorrow is our doubts of today."
        };
        int randomIndex = (int) (Math.random() * quotes.length);
        System.out.println("Random Quote: " + quotes[randomIndex]);
    }
}
