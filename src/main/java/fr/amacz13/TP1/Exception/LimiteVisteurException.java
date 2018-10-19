package fr.amacz13.TP1.Exception;

public class LimiteVisteurException extends Exception {

	public LimiteVisteurException() {
		System.err.println("Il y a trop de visiteurs dans le secteur, il va falloir commencer à mettre des gens dans les cages...");
	}

}