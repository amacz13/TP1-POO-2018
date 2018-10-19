package fr.amacz13.TP1.Classes;

import java.util.ArrayList;
import java.util.List;

import fr.amacz13.TP1.Exception.AnimalDansMauvaisSecteurException;
import fr.amacz13.TP1.Exception.LimiteVisteurException;

public class Zoo {

	int visiteurs;
	public ArrayList<Secteur> secteursAnimaux = new ArrayList<Secteur>();
	
	public void nouveauVisteur() throws LimiteVisteurException {
		if (visiteurs == getLimiteVisteurs()) {
			throw new LimiteVisteurException();
		} else {
			visiteurs++;
		}
	}
	
	public int getLimiteVisteurs() {
		return secteursAnimaux.size()*15;
	}
	
	public void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException {
		for (Secteur s : secteursAnimaux) {
			if (s.espece.equals(a.esp)) {
				s.ajouterAnimal(a);
				return;
			}
		}
		Secteur s = new Secteur(a.esp);
		s.ajouterAnimal(a);
		secteursAnimaux.add(s);
	}
	
	public int nombreAnimaux() {
		return visiteurs;
	}
}
