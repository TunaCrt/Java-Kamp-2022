package Kodlamaİo.dataAccess.Jdbc;

import Kodlamaİo.dataAccess.CoruseDao;
import Kodlamaİo.entities.Coruse;

public class CoruseJdbcDao implements CoruseDao {
    @Override
    public void add(Coruse coruse) {
        System.out.println("Kurs JDBC ile veritabanına eklendi");
    }
}
