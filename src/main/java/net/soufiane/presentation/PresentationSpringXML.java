package net.soufiane.presentation;

import net.soufiane.metier.IMetier;
import net.soufiane.metier.MetierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args) {
        System.out.println("**Instanciation via Spring XML");
        System.out.println("**Appel des beans via le fichier config.xml de Spring");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        //bean avec l'id souhaité exemple metier
        IMetier metier = (MetierImpl) applicationContext.getBean("metier");
        //ou
        //IMetier metier =  applicationContext.getBean(IMetier.class);
        System.out.println("Le resultat metier (appel de calcul) = " + metier.calcul());
    }
}
