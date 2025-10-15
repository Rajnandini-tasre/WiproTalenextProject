package com.cardgame;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private char symbol;
    private int number;

    // Constructor
    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    // Getters
    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    // Defines how Card objects are sorted. Sorting is based on the symbol.
    @Override
    public int compareTo(Card other) {
        // Compare based on the character symbol
        return Character.compare(this.symbol, other.symbol);
    }
    
    // Defines equality for the Set. Two cards are "equal" if their symbols are the same.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return this.symbol == card.symbol;
    }

    // The hashCode must be consistent with equals. It's based only on the symbol.
    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }
    
    // Defines how a Card object is represented as a String for printing.
    @Override
    public String toString() {
        return this.symbol + " " + this.number;
    }
}