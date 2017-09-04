package Command;

public class SellStock implements Order {
	private Stock abcStock = null;
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	
	@Override
	public void execute() {
		this.abcStock.sell();
	}

}
