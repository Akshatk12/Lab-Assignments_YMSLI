package day3;

public class CommisionedEmployee extends Employee {
	private double totSale;
	private double percentage;

	CommisionedEmployee(String name, int id, double salary, double rate, double totSale, double percentage) {
		super(name, id, salary, rate);
		this.totSale = totSale;
		this.percentage = percentage;

	}

	public double getTotSale() {
		return totSale;
	}

	public void setTotSale(int totSale) {
		this.totSale = totSale;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public double getPayment() {
		setSalary((totSale * percentage) / 100);
		return getSalary();

	}
}