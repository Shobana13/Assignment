package inher3;

import java.util.Scanner;

public abstract class WrittenItem extends Item {
	private String author;
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public WrittenItem() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter author name: ");
		setAuthor(sc.next());
	}
	void dislay() {
		super.dislay();
		System.out.printf("authorname: "+getAuthor()+" ,");
	}
}
