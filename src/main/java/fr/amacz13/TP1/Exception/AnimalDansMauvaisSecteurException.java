package fr.amacz13.TP1.Exception;

public class AnimalDansMauvaisSecteurException extends Exception {

	public AnimalDansMauvaisSecteurException() {
		System.err.println("L'animal a été mis dans le mauvais secteur ! Il vient de mourrir mangé. RIP petit animal...");
	}
}
