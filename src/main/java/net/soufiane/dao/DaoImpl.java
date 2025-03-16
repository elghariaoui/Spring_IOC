package net.soufiane.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("DAO : getData Version Base de données");
        double data = 34.0;
        return data;

    }
}
