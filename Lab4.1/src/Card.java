public class Card {
    public static void main(String[] args)
    {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] NUMBERS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //setting up deck
        int deck = SUITS.length * NUMBERS.length;
        String[] card = new String[deck];
        for (int i = 0; i < NUMBERS.length; i++)
        {
            for (int j = 0; j < SUITS.length; j++)
            {
                card[SUITS.length * i + j] = NUMBERS[i] + " of " + SUITS[j];
            }
        }
        //randomizing card pull
        for (int i = 0; i < deck; i++)
        {
            int random = i + (int) (Math.random() * (deck-i));
            String cards = card[random];
            card[random] = card[i];
            card[i] = cards;
        }
        for (int i = 0; i < 5; i++)
            System.out.println(card[i]);
        }
    }