package inher3;

import java.util.Scanner;

public abstract class Item {
	private int id_num;
	private String title;
	private int no_of_copies;
	
	
	public int getId_num() {
		return id_num;
	}
	public void setId_num(int id_num) {
		this.id_num = id_num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	public Item() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id_num:\n");
		setId_num(sc.nextInt());
		System.out.println("Enter title:\n ");
		setTitle(sc.next());
		System.out.println("Enter no_of_copies: ");
		setNo_of_copies(sc.nextInt());
		}
	void dislay() {
		System.out.printf("Id:"+getId_num()+"," +"Title: "+getTitle()+","+ "No_of_copies: "+getNo_of_copies()+",");
	}
	
	
}
