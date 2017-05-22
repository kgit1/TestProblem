package aTestProblem;

public class DataText {

	private double spent;
	private String currency;
	private String description;

	public DataText(double spent, String currency, String description) {
		this.spent = spent;
		this.currency = currency;
		this.description = description;
	}

	public double getSpent() {
		return spent;
	}

	public String getCurrency() {
		return currency;
	}

	public String getProduct() {
		return description;
	}

	@Override
	public String toString() {
		return " " + spent + " " + currency + " " + description;
	}

}
