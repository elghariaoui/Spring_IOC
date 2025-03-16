package net.soufiane.presentation;

import net.soufiane.dao.IDao;
import net.soufiane.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("**Instanciation Dynamique...");

        System.out.println("**Lecture des noms des classes via le fichier config.txt");
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();//constructeur sans parametre
        System.out.println("Dao Class: " + dao.getClass().getName()+ " getData: "+ dao.getData());

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        //choix1
        //Debut appel avec constructeur
        // IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        //Fin appel avec constructeur
        //Choix2
        // Debut appel sans constructeur
        IMetier metier = (IMetier) cMetier.newInstance();
        Method setDaoMethod = cMetier.getMethod("setDao", IDao.class);
        setDaoMethod.invoke(metier,dao);
        // Fin appel sans constructeur
        System.out.println("Metier Class: " + metier.getClass().getName() + ". Le resultat metier (appel de calcul) = " + metier.calcul());

    }
}
