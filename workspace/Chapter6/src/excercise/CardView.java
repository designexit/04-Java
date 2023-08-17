package excercise;

public class CardView {
	private static CardView instance = new CardView();
	private static int cardNum = 1000;
	private CardView() {};
	public static CardView getinstance() {
		return instance;
	}
	public static void setInstance(CardView instance) {
		CardView.instance = instance;
	}
	public static int getCardNum() {
		return cardNum;
	}
	public static void setCardNum(int cardNum) {
		CardView.cardNum = cardNum;
	}
	
	public static Card newCard() {
		Card card = new Card();
		cardNum++;
		card.setCardNum(cardNum);
		return card;
	}
	

}
