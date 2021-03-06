package view;

import controller.idMaker;

public class Principal {

	public static void main(String[] args) {
		
		for (int idThread = 0 ; idThread < 4 ; idThread++) {
			Thread mk = new idMaker(idThread);
			mk.start();
		}
	}
}
