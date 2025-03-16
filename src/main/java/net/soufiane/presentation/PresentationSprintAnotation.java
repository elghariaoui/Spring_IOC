package net.soufiane.presentation;

import net.soufiane.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSprintAnotation {
    public static void main(String[] args) {
        System.out.println("**Instanciation via Spring Annotation");
        System.out.println("**IOC via les annotations");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.soufiane.dao", "net.soufiane.metier");
        IMetier metier = applicationContext.getBean("metier", IMetier.class);

        System.out.println(("Le resultat metier (appel de calcul) = "+ metier.calcul()));
    }
}
