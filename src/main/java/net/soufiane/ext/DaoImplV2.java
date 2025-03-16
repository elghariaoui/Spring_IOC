package net.soufiane.ext;

import net.soufiane.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public  class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("DAO : DaoImplV2 getData version Capteur");
        return 15;
    }
}
