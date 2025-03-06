import java.util.Scanner;

class DeckOfCards {
    // Suits and Ranks
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Method to initialize the deck of cards
    private static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    private static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = (int) (Math.random() * (n - i)) + i; // Generate a random index
            // Swap deck[i] and deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards among players
    private static String[][] distributeCards(String[] deck, int numOfPlayers, int numOfCardsPerPlayer) {
        String[][] players = new String[numOfPlayers][numOfCardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their assigned cards
    private static void printPlayersWithCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s Cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck of cards
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numOfPlayers = input.nextInt();

        System.out.print("Enter number of cards given to each player: ");
        int numOfCardsPerPlayer = input.nextInt();

        // Check if distribution is possible
        if (numOfPlayers * numOfCardsPerPlayer > deck.length) {
            System.out.println("Cannot distribute cards. Not enough cards in the deck.");
            System.exit(0);
        }

        // Distribute cards among players
        String[][] players = distributeCards(deck, numOfPlayers, numOfCardsPerPlayer);

        // Print the players and their assigned cards
        printPlayersWithCards(players);
    }
}
