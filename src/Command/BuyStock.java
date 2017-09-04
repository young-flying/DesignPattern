package Command;

public class BuyStock implements Order {
	private Stock abcStock = null;
	
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	
	@Override
	public void execute() {
		abcStock.buy();
	}

}
