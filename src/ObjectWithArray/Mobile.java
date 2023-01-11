package ObjectWithArray;

public class Mobile {
	 private int Id;
	 private String name;
	 private String company;
	 private int price;
	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [Id=" + Id + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}

}
