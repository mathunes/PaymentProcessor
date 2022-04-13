package payment;

import java.util.Date;

public class Payment {
	
	private double value;
	private Date date;
	private String type;
	
	public Payment(double value, Date date, String type) {
		this.value = value;
		this.date = date;
		this.type = type;
	}

	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
