package fr.amacz13.TP1.Classes;

import java.util.ArrayList;
import java.util.Comparator;

import fr.amacz13.TP1.Classes.Animals.Espece;
import fr.amacz13.TP1.Exception.AnimalDansMauvaisSecteurException;

public class Secteur implements Comparator<Secteur>{

	public ArrayList<Animal> animaux = new ArrayList<Animal>();
	Espece espece;
	
	Secteur(Espece esp) {
		espece = esp;
	}
	
	public void ajouterAnimal(Animal a) throws AnimalDansMauvaisSecteurException {
		if (a.esp.equals(espece)) {
			animaux.add(a);
		} else {
			throw new AnimalDansMauvaisSecteurException();
		}
	}
	
	public int getNombreAnimaux() {
		return animaux.size();
	}
	
	public Espece getEspece() {
		return espece;
	}

	public int compare(Secteur o1, Secteur o2) {
		return (o1.getNombreAnimaux() - o2.getNombreAnimaux());
	}
	
}
