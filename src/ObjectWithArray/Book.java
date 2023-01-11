package ObjectWithArray;

public class Book {
 private int id;
 private String name;
 private String author;
 private int price;
 private int page;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAuthor() {
	return author;
}
public int getPrice() {
	return price;
}
public int getPage() {
	return page;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAuthor(String author) {
	this.author = author;
}
public void setPrice(int price) {
	this.price = price;
}
public void setPage(int page) {
	this.page = page;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", page=" + page + "]";
}
 
}
