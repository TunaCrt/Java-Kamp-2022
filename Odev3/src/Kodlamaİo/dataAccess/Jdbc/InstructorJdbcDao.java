package Kodlamaİo.dataAccess.Jdbc;

import Kodlamaİo.dataAccess.InstructorDao;
import Kodlamaİo.entities.Instructor;

public class InstructorJdbcDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen JDBC ile veritabanına eklendi");
    }
}
