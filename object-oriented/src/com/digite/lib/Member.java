package com.digite.lib;
public class Member {
	private String name;
	private Book book;
	
	public	Member()
	{
	}

	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void status() {
		System.out.println("--------------");
		if (this.book == null)
			System.out.println(this.name+" has not been issued a book!");
		else
			System.out.println(this.name+" has been issued "+this.book.getTitle());
		System.out.println("--------------");
	}
	
	public void setBook(Book b) {
		this.book = b;
	}
	
	public Book getBook() {
		return this.book;
	}
}
