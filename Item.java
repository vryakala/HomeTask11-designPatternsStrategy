package designPatternsStrategy;

public class Item {
	private String code;
	private int price;

	public Item(String ItemCode, int cost) {
		this.code = ItemCode;
		this.price = cost;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
