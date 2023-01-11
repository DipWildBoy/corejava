package Encapsulation;

public class Product {
	//POJO or model Entity class
	private int id;
	private String name;
	private String company;
	private int Price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", company=" + company + ", Price=" + Price + "]";
	}
	

}
