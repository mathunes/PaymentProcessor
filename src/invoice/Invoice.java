package invoice;

import java.util.Date;

public class Invoice {
	
	public Invoice(Date date, double total, String clientName) {
		setDate(date);
		setTotal(total);
		setClientName(clientName);
		setPaid(false);
	}

	public Invoice() {
	}

	private Date date;
	private double total;
	private String clientName;
	private boolean paid;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
}
