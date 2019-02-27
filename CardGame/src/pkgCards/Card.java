package pkgCards;

public class Card {

	private eCardSuit eSuit;
	private eCardRank eRank;
	public Card(eCardSuit eSuit, eCardRank eRank) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
	}
	public eCardSuit geteSuit() {
		return eSuit;
	}
	public eCardRank geteRank() {
		return eRank;
	}

	public boolean isHeart()
	{
		if (eSuit == eCardSuit.HEARTS)
			return true;
		else
			return false;
	}
	
}
