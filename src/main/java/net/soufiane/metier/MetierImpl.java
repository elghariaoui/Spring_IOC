package net.soufiane.metier;

import net.soufiane.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("d")
    private IDao dao ; //couplage faible


    public MetierImpl() {
    }

    /**
     * Pour injecter dans l'attribut dao
     * un objet qui implémente l'interface IDAO
     * @param dao
     */
    public MetierImpl( IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.pow(10, -9);
        return res;

    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
