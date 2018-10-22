package fr.amacz13.TP1;

import fr.amacz13.TP1.Classes.Zoo;
import fr.amacz13.TP1.Classes.Animals.Chat;
import fr.amacz13.TP1.Classes.Animals.Chien;
import org.apache.logging.log4j.LogManager ;
import org.apache.logging.log4j.Logger ;

public class App 
{
	Zoo zoo;
	private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Welcome to my zoo !" );
        Chat c1 = new Chat("Caramel");
        Chat c2 = new Chat("Fleur de feu");
        Chien c3 = new Chien("Framboise");
        logger.info("DEBUT DES LOGS");
        logger.debug(c1.getNomAnimal());
        logger.warn(c2.getNomAnimal());
        logger.error(c3.getNomAnimal());
        logger.fatal("END OF LOGS");
        
        //Just for push
    }
}
