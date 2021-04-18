package inher3;

import java.util.Scanner;

public class Cd extends MediaItem {
	private String artist;
	private String genre;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	Cd(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Artist:");
		setArtist(sc.nextLine());
		System.out.println("Enter Genre: ");
		setGenre(sc.nextLine());
	}
	void dislay() {
		super.dislay();
		System.out.print("Artist name: " + getArtist() + "," + "Genre: " + getGenre());
	}

}
