package pkgCards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();

	private Deck() {
		for (eCardSuit eS : eCardSuit.values()) {
			for (eCardRank eR : eCardRank.values()) {

				if ((eS != eCardSuit.JOKER) && (eR != eCardRank.JOKER)) {
					Card c = new Card(eS, eR);
					cards.add(c);
				}
			}
		}

		Collections.shuffle(cards);
	}

	public Deck(int iJokers) {

		this();

		for (int i = 0; i < iJokers; i++) {
			cards.add(new Card(eCardSuit.JOKER, eCardRank.JOKER));
		}

		Collections.shuffle(cards);
	}
}
