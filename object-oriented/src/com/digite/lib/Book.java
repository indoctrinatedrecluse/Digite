package com.digite.lib;
public class Book {
	private String title;
	private Member member;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void status() {
		System.out.println("--------------");
		if (this.member == null)
			System.out.println(this.title+" has not been issued to a member!");
		else
			System.out.println(this.title+" has been issued to "+this.member.getName());
		System.out.println("--------------");
	}
	
	public void issueBook(Member m) throws LibraryException {
		if (this.member == null && m.getBook() == null) {
			this.member = m;
			m.setBook(this);
		}
		else if (m.getBook() != null) {
			throw new LibraryException(m.getName()+" has already been issued a book!");
		}
		else
			throw new LibraryException(this.title+" could not be issued to "+m.getName()+"!");
	}
	
	public void returnBook(Member m) throws LibraryException {
		if (this.member != null && m.getBook() != null && m.getName().equals(this.member.getName())) {
			this.member = null;
			m.setBook(null);
		}
		else if (m.getBook() == null)
			throw new LibraryException(m.getName()+" has no book to return!");
		else if (this.member != null && m.getBook() != null && !m.getName().equals(this.member.getName()))
			throw new LibraryException(m.getName()+" cannot return "+this.title+" as it was not issued to them!");
		else
			throw new LibraryException(this.title+" could not be returned by "+m.getName()+"!");
	}
}
