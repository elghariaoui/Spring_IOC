package net.soufiane.metier;

import net.soufiane.dao.IDao;

public interface IMetier {
    double calcul();

    void setDao(IDao dao);
}
