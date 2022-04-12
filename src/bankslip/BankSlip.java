package bankslip;

import java.util.Date;

public class BankSlip {

	private String code;
	private Date date;
	private double value;
	
	public BankSlip(String code, Date date, double value) {
		setCode(code);
		setDate(date);
		setValue(value);
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
}
