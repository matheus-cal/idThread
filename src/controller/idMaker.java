package controller;

public class idMaker extends Thread {
	private long id;

	public idMaker(int id) {
		this.id = getId();
	}
	
	@Override
	public void run() {
		System.out.println("TID ==> " + id);
	}
}
