package com.java8.features;


public class Book {

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookName=" + bookName + ", price=" + price + "]";
	}
	private int bid;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bid, String bookName, double price) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.price = price;
	}
	private String bookName;
	private double price;
}
