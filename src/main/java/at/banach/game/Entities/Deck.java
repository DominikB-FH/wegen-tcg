package at.banach.game.Entities;

import java.util.List;

public class Deck {
    private List<Card> deck;

    public void addCard(Card card) {
        if(deck.size() <= 20){
            deck.add(card);
        } else {
            changeCard(card);
        }
    }

    public void removeCard(Card card) {
        deck.remove(card);
    }

    public void changeCard(Card card) {

    }

    public void printDeck(){
        deck.forEach(System.out::println);
    }

    public int getDeckSize(){
        return deck.size();
    }

    public List<Card> getDeck(){
        return deck;
    }
}
