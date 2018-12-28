package model;

public class Product {
	private int prodid;
	private String prodname;
	private int rate;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodid, String prodname, int rate) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", rate=" + rate + "]";
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}

}
