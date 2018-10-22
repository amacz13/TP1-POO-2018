package fr.amacz13.TP1;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.amacz13.TP1.Classes.Secteur;
import fr.amacz13.TP1.Classes.Zoo;
import fr.amacz13.TP1.Classes.Animals.Chat;
import fr.amacz13.TP1.Classes.Animals.Chien;
import fr.amacz13.TP1.Classes.Animals.Espece;
import fr.amacz13.TP1.Exception.AnimalDansMauvaisSecteurException;
import fr.amacz13.TP1.Exception.LimiteVisteurException;

public class AppTest {

	/*
	 * Test Unitaire Limite Visteur
	 * 
	@Test
	public void test() throws AnimalDansMauvaisSecteurException, LimiteVisteurException {
        System.out.println( "Welcome to my zoo !" );
        Chat c1 = new Chat("Caramel");
        Chat c2 = new Chat("Fleur de feu");
        Chien c3 = new Chien("Framboise");
        
        Zoo zoo = new Zoo();
        zoo.nouvelAnimal(c1);
        zoo.nouvelAnimal(c2);
        zoo.nouvelAnimal(c3);
        
        for (int i = 0; i < 6500; i++) zoo.nouveauVisteur();
	}
	
	
	
	*/
	
	
	@Test
	public void test() throws AnimalDansMauvaisSecteurException, LimiteVisteurException {
        System.out.println( "Welcome to my zoo !" );
        Chat c1 = new Chat("Caramel");
        Chat c2 = new Chat("Fleur de feu");
        Chien c3 = new Chien("Framboise");
        Chien c4 = new Chien("Fraise");
        
        Zoo zoo = new Zoo();
        zoo.nouvelAnimal(c1);
        zoo.nouvelAnimal(c2);
        zoo.nouvelAnimal(c3);
        zoo.nouvelAnimal(c4);
        
        for (Secteur s : zoo.secteursAnimaux) {
        	if (s.getEspece().equals(Espece.CHIEN)) {
        		assertEquals(c3,s.animaux.get(0));
        	}
        }
        
        System.out.println(zoo.secteursAnimaux.get(0).compare(zoo.secteursAnimaux.get(0), zoo.secteursAnimaux.get(1)));
	}

}
