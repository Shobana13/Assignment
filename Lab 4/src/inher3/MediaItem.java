package inher3;

import java.util.Scanner;

public abstract class MediaItem extends Item{
	private int runtime;
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public MediaItem() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter RunTime: ");
		setRuntime(sc.nextInt());
	}
	void dislay() {
		super.dislay();
		System.out.printf("Runtime: "+getRuntime()+" ,");
	}

}
