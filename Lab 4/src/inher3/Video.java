package inher3;

import java.util.Scanner;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	Video() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Director name: ");
		setDirector(sc.next());
		System.out.println("Enter Genre: ");
		setGenre(sc.next());
		System.out.println("Enter Published Year ");
		setYear(sc.nextInt());
	}

	void dislay() {
		super.dislay();
		System.out.print("Director name: " + getDirector() + "," + "Genre: " + getGenre() + "," + "Published Year: "
				+ getYear() + ",");
	}

}
