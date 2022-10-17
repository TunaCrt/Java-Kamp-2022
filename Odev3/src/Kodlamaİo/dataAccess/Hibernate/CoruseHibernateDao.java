package Kodlamaİo.dataAccess.Hibernate;

import Kodlamaİo.dataAccess.CoruseDao;
import Kodlamaİo.entities.Coruse;

public class CoruseHibernateDao implements CoruseDao {
    @Override
    public void add(Coruse coruse) {
        System.out.println("Kurs Hibernate ile veritabanına eklendi");
    }
}
