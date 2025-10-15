import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Card {
    private char symbol;
    private int number;

    
    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    
    public int getNumber() {
        return number;
    }
}


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        Map<Character, List<Card>> cardMap = new TreeMap<>();

        
        System.out.println("Enter Number of Cards");
        int numberOfCards = scanner.nextInt();

       
        for (int i = 1; i <= numberOfCards; i++) {
            System.out.println("Enter card " + i);
            char symbol = scanner.next().charAt(0);
            int number = scanner.nextInt();

            
            Card card = new Card(symbol, number);

            
            cardMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(card);
        }
        
        System.out.println("\nDistinct symbols are :");

        
        for (Map.Entry<Character, List<Card>> entry : cardMap.entrySet()) {
            char symbol = entry.getKey();
            List<Card> cardsInSymbol = entry.getValue();
            int sum = 0;

            System.out.println("Cards in " + symbol + " symbol are :");
            
           
            for (Card card : cardsInSymbol) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }

            System.out.println("Number of cards : " + cardsInSymbol.size());
            System.out.println("Sum of Numbers : " + sum);
        }

       
        scanner.close();
    }
}