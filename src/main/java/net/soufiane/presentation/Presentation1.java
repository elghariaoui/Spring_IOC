package net.soufiane.presentation;

import net.soufiane.dao.DaoImpl;
import net.soufiane.dao.IDao;
import net.soufiane.ext.DaoImplV2;
import net.soufiane.metier.IMetier;
import net.soufiane.metier.MetierImpl;

public class Presentation1 {

    public static void main(String[] args) {
        System.out.println("**Instanciation statique...");
        //injection de dependance de maniere statique,
        IDao dao = new DaoImpl();
        IDao daov2 = new DaoImplV2();
        IMetier metier = new MetierImpl(dao);
        //IMetier metier = new MetierImpl(daov2);
        //metier.setDao(dao);
        System.out.println("Le resultat metier (appel de calcul) = "+metier.calcul());
    }
}

